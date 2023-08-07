package com.ywl.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author Administrator
 */
@MapperScan(value = "com.ywl.springboot.mapper")
@SpringBootApplication
@EnableCaching
public class SpringbootApplication {

	public static void main(String[] args) {
		System.out.println("启动成功");
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
