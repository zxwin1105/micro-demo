package com.micro.account.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zhaixinwei
 * @date 2022/8/25
 * @description
 */

@Api(tags = "TestController（测试）",value = "测试控制器")
@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "测试")
    @GetMapping
    public String test(){
        log.error("df");
        return LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE);
    }
}
