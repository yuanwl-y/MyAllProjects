package com.ywl.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by ywl--- 2021-07-21-15:55
 **/

@RestController
public class helloController {
    @RequestMapping("/test")
    public String test() {
        System.out.println("日志打印");
        return "SUCCESS";
    }
}
