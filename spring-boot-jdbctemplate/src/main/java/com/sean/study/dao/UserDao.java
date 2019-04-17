package com.sean.study.dao;

import com.sean.study.bean.User;
import com.sean.study.util.base.Page;

/**
  * 用户增删改查数据库访问层
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/24 17:26
  * @version:  1.0 2018/3/24
* */
public interface UserDao {

    /**
     * 插入
     * 
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 删除
     * 
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 更新
     * 
     * @param user
     * @return
     */
    int updateById(User user);

    /**
     * 查找
     * 
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     * @return
     */
    Page<User> queryForPage(int pageCurrent, int pageSize, String name);

}
