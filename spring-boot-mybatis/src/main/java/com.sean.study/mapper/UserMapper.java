package com.sean.study.mapper;

import com.sean.study.bean.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * java类简单作用描述
 *
 * @author: chenxu-hd@139.com
 * @date: 2018/3/25 23:41
 * @version: 1.0 2018/3/25
 */
@Mapper
public interface UserMapper {

    @Insert(value = "insert into hand_user (name, create_time) values (#{name,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})")
    int insert(User record);

    @Select(value = "select id, name, create_time from hand_user where id = #{id,jdbcType=INTEGER}")
    @Results(value = { @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP) })
    User selectByPrimaryKey(Integer id);
}
