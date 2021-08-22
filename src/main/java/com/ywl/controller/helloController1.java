package com.ywl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by ywl--- 2021-07-21-15:55
 **/

@RestController
public class helloController1 {
    @RequestMapping("/test")
    public String test() {
        System.out.println("日志打印");
        System.out.println("日志提交git");
        return "SUCCESS";

    }
}
