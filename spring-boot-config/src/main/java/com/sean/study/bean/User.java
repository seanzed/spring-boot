package com.sean.study.bean;

import java.util.Date;

/**
 * 用户bean
 *
 * @author: chenxu-hd@139.com
 * @date: 2018/3/19 20:58
 * @version: 1.0 2018/3/19
 */
public class User {

    private int id;

    private String name;

    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
