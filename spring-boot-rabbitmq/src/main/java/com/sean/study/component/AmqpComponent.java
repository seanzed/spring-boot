package com.sean.study.component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
  * rabbitmq测试组件
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/25 21:18
  * @version:  1.0 2018/3/25
* */
@Component
public class AmqpComponent {

	@Autowired
	private AmqpTemplate amqpTemplate;

	public void send(String msg) {
		this.amqpTemplate.convertAndSend("seanchen.queue", msg);
	}

	@RabbitListener(queues = "seanchen.queue")
	public void receiveQueue(String text) {
		System.out.println("接受到：" + text);
	}

}
