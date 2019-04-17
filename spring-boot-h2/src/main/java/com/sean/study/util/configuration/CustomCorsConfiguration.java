package com.sean.study.util.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**     
  * java类简单作用描述
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/25 16:12
  * @version:  1.0 2018/3/25
* */
@Configuration
public class CustomCorsConfiguration {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// 限制了路径和域名的访问
				//registry.addMapping("/api/**").allowedOrigins("http://localhost:8080");
			}
		};
	}
}
