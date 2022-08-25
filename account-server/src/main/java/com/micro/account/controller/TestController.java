package com.micro.account.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaixinwei
 * @date 2022/8/25
 * @description
 */
@RestController
@RefreshScope
@RequestMapping("/test")
public class TestController {
    @Value("${test.config}")
    private String config;

    @GetMapping
    public String test(){
        return config;
    }
}
