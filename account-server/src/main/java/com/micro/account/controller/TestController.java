package com.micro.account.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apiguardian.api.API;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "测试")
    @GetMapping
    public String test(){
        return LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE);
    }
}
