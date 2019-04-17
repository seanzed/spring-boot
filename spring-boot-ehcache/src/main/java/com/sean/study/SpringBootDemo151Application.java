package com.sean.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;


/**
 * Springboot启动类
 * 通过ServletComponentScan当前包及其子包实现bean自动注入
 * @author: chenxu-hd@139.com
 * @date: 2018/3/19 20:55
 * @version: 1.0 2018/3/19
 */
@EnableCaching
@ServletComponentScan
@SpringBootApplication
public class SpringBootDemo151Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo151Application.class, args);
    }

}
