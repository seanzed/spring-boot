package com.sean.study.cache.impl;

import com.sean.study.bean.UserLog;
import com.sean.study.cache.UserLogCache;
import com.sean.study.dao.UserLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;



/**
  * ehcache缓存实现类
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/25 19:55
  * @version:  1.0 2018/3/25
* */
@CacheConfig(cacheNames = "handCache")
@Repository
public class UserLogCacheImpl implements UserLogCache {

    @Autowired
    private UserLogDao userLogDao;

    @Cacheable(key = "#p0")
    @Override
    public UserLog selectById(Integer id) {
        System.out.println("查询功能，缓存找不到，直接读库, id=" + id);
        return userLogDao.findOne(id);
    }

    @CachePut(key = "#p0")
    @Override
    public UserLog updateById(UserLog roncooUserLog) {
        System.out.println("更新功能，更新缓存，直接写库, id=" + roncooUserLog);
        return userLogDao.save(roncooUserLog);
    }

    @CacheEvict(key = "#p0")
    @Override
    public String deleteById(Integer id) {
        System.out.println("删除功能，删除缓存，直接写库, id=" + id);
        return "清空缓存成功";
    }

}
