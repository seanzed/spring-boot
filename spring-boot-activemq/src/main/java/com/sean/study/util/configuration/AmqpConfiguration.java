package com.sean.study.util.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
  * rabbitmq配置
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/25 21:15
  * @version:  1.0 2018/3/25
* */
@Configuration
public class AmqpConfiguration {

	@Bean
	public Queue queue() {
		return new Queue("seanchen.queue");
	}

}
