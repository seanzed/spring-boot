package com.sean.study.mapper;

import com.sean.study.bean.User;
import com.sean.study.bean.UserExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户增删改查数据库交互层
 *
 * @author: chenxu-hd@139.com
 * @date: 2018/3/25 23:41
 * @version: 1.0 2018/3/25
 */
@Mapper
public interface UserMapper {

    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
