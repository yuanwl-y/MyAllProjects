package com.ywl.springboot.demotest;

import lombok.Data;

/**
 * 基于jdk1.8实现任务异步处理
 *
 * @author Administrator
 */
@Data
public class YIbuMain {
	public static void main(String[] args) {
//		// 两个线程的线程池
//		ExecutorService executor = Executors.newFixedThreadPool(2);
//		//jdk1.8之前的实现方式
//		CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
//			@Override
//			public String get() {
//				System.out.println("task started!");
//				//模拟耗时操作
//				System.out.println(System.currentTimeMillis());
//				return "task finished!";
//			}
//		}, executor);
//
//		//采用lambada的实现方式
//		future.thenAccept(e -> System.out.println(e + " ok"));
//
//		System.out.println("main thread is running");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("线程名称：" + Thread.currentThread().getName());
			}
		};
		new Thread(runnable).start();

		Runnable runnable1 = () -> System.out.println(Thread.currentThread());
	}

}
