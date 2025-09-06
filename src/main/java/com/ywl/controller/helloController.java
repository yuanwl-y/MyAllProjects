package com.ywl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by ywl--- 2021-07-21-15:55
 **/

@RestController
public class helloController {
    @GetMapping("/test")
    public String test() {
        System.out.println("日志打印");
        System.out.println("日志提交git");
        return "项目启动成功！！！-热部署测试";

    }
}
