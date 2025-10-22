package com.ywl.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Create by ywl--- 2021-07-21-15:55
 **/

@RestController
@Api(tags = "本地测试", description = "本地测试")
public class helloController {
    @GetMapping("/test")
    public String test() {
        System.out.println("日志打印");
        System.out.println("日志提交git");
        return "项目启动成功！！！-热部署测试";

    }

    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
    }
}
