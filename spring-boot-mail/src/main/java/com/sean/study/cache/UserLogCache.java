package com.sean.study.cache;


import com.sean.study.bean.UserLog;

/**
  * ehcache用户记录表缓存增删改查
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/25 19:54
  * @version:  1.0 2018/3/25
* */
public interface UserLogCache {

    /**
     * 查询
     * 
     * @param id
     * @return
     */
    UserLog selectById(Integer id);

    /**
     * 更新
     * 
     * @param roncooUserLog
     * @return
     */
    UserLog updateById(UserLog roncooUserLog);

    /**
     * 删除
     * 
     * @param id
     * @return
     */
    String deleteById(Integer id);
}
