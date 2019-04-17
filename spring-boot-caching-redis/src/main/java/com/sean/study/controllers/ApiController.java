package com.sean.study.controllers;

import java.util.Date;
import java.util.HashMap;

import com.sean.study.bean.UserLog;
import com.sean.study.cache.UserLogCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxu-hd@139.com
 */
@RestController
@RequestMapping(value = "/api", method = RequestMethod.POST)
public class ApiController {

    @Autowired
    private UserLogCache userLogCache;

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/get")
    public HashMap<String, Object> get(@RequestParam String name) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", "hello world");
        map.put("name", name);
        return map;
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public UserLog get(@RequestParam(defaultValue = "1") Integer id) {
        return userLogCache.selectById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public UserLog update(@RequestParam(defaultValue = "1") Integer id) {
        UserLog bean = userLogCache.selectById(id);
        bean.setUserName("测试");
        bean.setCreateTime(new Date());
        userLogCache.updateById(bean);
        return bean;
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public String del(@RequestParam(defaultValue = "1") Integer id) {
        return userLogCache.deleteById(id);
    }
}
