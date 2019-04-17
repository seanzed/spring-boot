package com.sean.study;

import com.sean.study.util.filter.CustomFilter;
import com.sean.study.util.listener.CustomListener;
import com.sean.study.util.servlet.CustomServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Springboot启动类
 * 通过实现ServletContextInitializer,添加servlet,filter,linter
 * @author: chenxu-hd@139.com
 * @date: 2018/3/19 20:55
 * @version: 1.0 2018/3/19
 */
@SpringBootApplication
public class SpringBootDemo82Application implements ServletContextInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo82Application.class, args);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        servletContext.addServlet("customServlet", new CustomServlet());

        servletContext.addFilter("customFilter", new CustomFilter());

        servletContext.addListener(new CustomListener());

    }
}
