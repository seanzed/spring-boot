package com.sean.study.controllers;

import com.sean.study.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;


/**     
  * java类简单作用描述
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/19 20:45
  * @version:  1.0 2018/3/19
* */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @Value(value = "${seanchen.secret}")
    private String secret;

    @Value(value = "${seanchen.number}")
    private int id;

    @Value(value = "${seanchen.desc}")
    private String desc;

    @RequestMapping
    public String index() {
        return "hello world";
    }

    // @RequestParam 简单类型的绑定，可以出来get和post
    @RequestMapping(value = "/get")
    public HashMap<String, Object> get(@RequestParam String name) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", "hello world");
        map.put("name", name);
        map.put("secret", secret);
        map.put("id", id);
        map.put("desc", desc);
        return map;
    }

    // @PathVariable 获得请求url中的动态参数
    @RequestMapping(value = "/get/{id}/{name}")
    public User getUser(@PathVariable int id, @PathVariable String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setDate(new Date());
        return user;
    }

}
