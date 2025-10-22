package com.ywl.util;

import cn.hutool.core.lang.Snowflake;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class SnowflakeIdGenerator {
    // 预创建Snowflake实例池，避免重复创建
    private static final int MAX_INSTANCES = 64;
    private static final Snowflake[] SNOWFLAKE_INSTANCES = new Snowflake[MAX_INSTANCES];
    private static final AtomicLong COUNTER = new AtomicLong(0);

    static {
        // 初始化Snowflake实例池
        for (int i = 0; i < MAX_INSTANCES; i++) {
            // 可以根据需要调整workerId和dataCenterId的分配策略
            long workerId = (i & 0x1F); // 5位workerId
            long dataCenterId = (i >> 5) & 0x1F; // 5位dataCenterId
            SNOWFLAKE_INSTANCES[i] = new Snowflake(workerId, dataCenterId);
        }
    }

    // 获取下一个Snowflake实例（轮询策略）
    private static Snowflake getNextSnowflakeInstance() {
        long index = COUNTER.getAndIncrement() & (MAX_INSTANCES - 1);
        return SNOWFLAKE_INSTANCES[(int) index];
    }

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println("开始生成ID：" + startTime);

        // 使用CPU核心数作为线程数以获得最佳性能
        int threads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        int totalIds = 100000000;
        int idsPerThread = totalIds / threads;

        // 使用AtomicLong替代数组来累加结果，避免大数组分配
        final AtomicLong dummy = new AtomicLong(0);

        for (int t = 0; t < threads; t++) {
            executor.submit(() -> {
                // 获取一个Snowflake实例
                Snowflake snowflake = getNextSnowflakeInstance();

                // 直接生成ID，不存储所有结果
                for (int i = 0; i < idsPerThread; i++) {
                    long id = snowflake.nextId();
                    // 仅保留最后生成的ID，避免JVM优化
                    if (i % 10000 == 0) {
                        dummy.set(id);
                    }
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        long endTime = System.currentTimeMillis();
        System.out.println("生成 100000000 个 ID 耗时: " + (endTime - startTime) + " 毫秒");
        // 输出最后一个ID，确保计算没有被优化掉
        System.out.println("最后生成的ID示例: " + dummy.get());
    }
}
