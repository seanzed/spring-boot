package com.sean.study;

import java.util.Date;
import java.util.List;

import com.sean.study.bean.UserLog;
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

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo121ApplicationTests {

    @Autowired
    private UserLogDao userLogDao;

    @Test
    public void insert() {
        UserLog entity = new UserLog();
        entity.setUserName("无境");
        entity.setUserIp("192.168.0.1");
        entity.setCreateTime(new Date());
        userLogDao.save(entity);
    }

    @Test
    public void delete() {
        userLogDao.delete(1);
    }

    @Test
    public void update() {
        UserLog entity = new UserLog();
        entity.setId(2);
        entity.setUserName("无境2");
        entity.setUserIp("192.168.0.1");
        entity.setCreateTime(new Date());
        userLogDao.save(entity);
    }

    @Test
    public void select() {
        UserLog result = userLogDao.findOne(1);
        System.out.println(result);
    }

    @Test
    public void select2() {
        List<UserLog> result = userLogDao.findByUserName("无境");
        System.out.println(result);
    }

    @Test
    public void select3() {
        List<UserLog> result = userLogDao.findByUserNameAndUserIp("无境", "192.168.0.1");
        System.out.println(result);
    }

    // 分页
    @Test
    public void queryForPage() {
        Pageable pageable = new PageRequest(0, 20, new Sort(new Sort.Order(Sort.Direction.DESC, "id")));
        Page<UserLog> result = userLogDao.findByUserName("无境", pageable);
        System.out.println(result.toString());
    }

}
