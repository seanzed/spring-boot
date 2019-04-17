package com.sean.study.bean;

import java.util.Date;

/**
  * 用户实体类
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/24 17:23
  * @version:  1.0 2018/3/24
* */
public class User {
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

	@Override
	public String toString() {
		return "RoncooUser [id=" + id + ", name=" + name + ", createTime=" + createTime + "]";
	}

}
