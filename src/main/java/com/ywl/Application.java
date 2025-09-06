package com.ywl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ywl.mapper")
public class Application {
    public static void main(String[] args) {
        // 设置 Swagger UI 基础 URL
        System.setProperty("springdoc.swagger-ui.base-url", "http://localhost:8080");
        SpringApplication.run(Application.class, args);
    }
}
