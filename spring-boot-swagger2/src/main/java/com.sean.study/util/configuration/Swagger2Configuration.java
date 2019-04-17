package com.sean.study.util.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * java类简单作用描述
 *
 * @author: chenxu-hd@139.com
 * @date: 2018/4/12 21:28
 * @version: 1.0 2018/4/12
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    /**
     * swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
     * @return
     */
    @Bean
    public Docket accessToken() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 定义组
                .groupName("api")
                // 选择那些路径和api会生成document
                .select()
                // 拦截的包路径
                .apis(RequestHandlerSelectors.basePackage("com.sean.study.controller"))
                // 拦截的接口路径
                .paths(regex("/api/.*"))
                // 创建
                .build()
                // 配置说明
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 标题
                .title("学习测试")
                // 描述
                .description("spring boot 学习")
                // 说明地址
                .termsOfServiceUrl("http://www.seanchen.com")
                // 联系
                .contact(new Contact("wujing", "http://www.seanchen.com", "1204955170@qq.com"))
                //.license("Apache License Version 2.0")// 开源协议
                //.licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")// 地址
                // 版本
                .version("1.0")
                .build();
    }
}
