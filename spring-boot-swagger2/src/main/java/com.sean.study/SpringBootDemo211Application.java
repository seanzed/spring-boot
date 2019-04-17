package com.sean.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * springboot启动类
 *
 * @author: chenxu-hd@139.com
 * @date: 2018/3/19 20:40
 * @version: 1.0 2018/3/19
 */
@ServletComponentScan
@SpringBootApplication
@ImportResource(locations = { "classpath:druid-bean.xml" })
public class SpringBootDemo211Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo211Application.class, args);
    }
}
