package com.sean.study.dao;

import com.sean.study.bean.UserLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
  * 用户增删改查数据库访问层
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/24 17:26
  * @version:  1.0 2018/3/24
* */
public interface UserLogDao extends JpaRepository<UserLog, Integer> {

    /**
     * @param userName
     * @return
     */
    @Query(value = "select u from UserLog u where u.userName=?1")
    List<UserLog> findByUserName(String userName);

    /**
     * @param string
     * @param string2
     * @return
     */
    List<UserLog> findByUserNameAndUserIp(String string, String string2);

    /**
     * @param userName
     * @param pageable
     * @return
     */
    Page<UserLog> findByUserName(String userName, Pageable pageable);

}
