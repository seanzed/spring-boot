package com.sean.study;

import com.sean.study.bean.UserLog;
import com.sean.study.cache.UserLogCache;
import com.sean.study.component.AmqpComponent;
import com.sean.study.component.RedisComponent;
import com.sean.study.dao.UserLogDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo171ApplicationTests {

    @Autowired
    private AmqpComponent amqpComponent;

    @Test
    public void send() {
        amqpComponent.send("hello world2");
    }

    @Test
    public void receive() {
        amqpComponent.receiveQueue("hello world2");
    }


}
