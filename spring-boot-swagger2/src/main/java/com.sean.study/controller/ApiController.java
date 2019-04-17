package com.sean.study.controller;

import com.sean.study.bean.User;
import com.sean.study.mapper.UserMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * java类简单作用描述
 *
 * @author: chenxu-hd@139.com
 * @date: 2018/4/14 21:19
 * @version: 1.0 2018/4/14
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private UserMapper userMappper;

    @ApiOperation(value = "查找", notes = "根据用户ID查找用户")
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public User get(@RequestParam(defaultValue = "1") Integer id) {
        return userMappper.selectByPrimaryKey(id);
    }

    @ApiIgnore
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public int delete(@RequestParam(defaultValue = "1") Integer id) {
        return userMappper.deleteByPrimaryKey(id);
    }
}
