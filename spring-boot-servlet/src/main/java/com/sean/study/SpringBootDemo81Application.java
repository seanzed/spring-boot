package com.sean.study;

import com.sean.study.util.filter.CustomFilter;
import com.sean.study.util.listener.CustomListener;
import com.sean.study.util.servlet.CustomServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Springboot启动类
 *
 * @author: chenxu-hd@139.com
 * @date: 2018/3/19 20:55
 * @version: 1.0 2018/3/19
 */
@SpringBootApplication
public class SpringBootDemo81Application {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new CustomServlet(), "/seanchen");
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        return new FilterRegistrationBean(new CustomFilter(), servletRegistrationBean());
    }

    @Bean
    public ServletListenerRegistrationBean<CustomListener> servletListenerRegistrationBean() {
        return new ServletListenerRegistrationBean<CustomListener>(new CustomListener());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo81Application.class, args);
    }
}
