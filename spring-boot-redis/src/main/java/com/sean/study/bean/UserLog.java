package com.sean.study.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 用户登录记录
 *
 * @author: chenxu-hd@139.com
 * @date: 2018/3/25 17:29
 * @version: 1.0 2018/3/25
 */
@Entity
public class UserLog {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Date createTime;

    @Column
    private String userName;

    @Column
    private String userIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    @Override
    public String toString() {
        return "UserLog{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", userName='" + userName + '\'' +
                ", userIp='" + userIp + '\'' +
                '}';
    }
}
