package com.micro.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.swing.*;

/**
 * @author zhaixinwei
 * @date 2022/8/25
 * @description
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class StorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class,args);
    }
}
