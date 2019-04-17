package com.sean.study.bean;

import java.io.Serializable;
import java.util.Date;

/**
  * java用户实体类
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/25 16:15
  * @version:  1.0 2018/3/25
* */
public class User implements Serializable {
    
    private int id;
    private String name;
    private Date createTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
