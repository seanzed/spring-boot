package com.sean.study.dao.impl;

import com.sean.study.bean.User;
import com.sean.study.dao.UserDao;
import com.sean.study.util.base.JdbcDaoImpl;
import com.sean.study.util.base.Page;
import com.sean.study.util.base.Sql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import org.springframework.util.StringUtils;


/**
  * 用户增删改查数据库访问层
  * @author:   xuchen-hd@139.com
  * @date:     2018/3/25 16:06
  * @version:  1.0 2018/3/25
* */
@Repository
public class UserDaoImpl extends JdbcDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(User user) {
        String sql = "insert into hand_user (name, create_time) values (?, ?)";
        return jdbcTemplate.update(sql, user.getName(), user.getCreateTime());
    }

    @Override
    public int deleteById(int id) {
        String sql = "delete from hand_user where id=?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateById(User user) {
        String sql = "update hand_user set name=?, create_time=? where id=?";
        return jdbcTemplate.update(sql, user.getName(), user.getCreateTime(), user.getId());
    }

    @Override
    public User selectById(int id) {
        String sql = "select * from hand_user where id=?";
        /*return jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setCreateTime(rs.getDate("create_time"));
                return user;
            }
        }, id);*/
        
        return queryForObject(sql, User.class, id);
    }
    
    @Override
    public Page<User> queryForPage(int pageCurrent, int pageSize, String name){
        // 确定参数
        /*String sql = "select * from roncoo_user where name=?";
        return queryForPage(sql.toString(), pageCurrent, pageSize, RoncooUser.class, name);*/
        
        // 若name可能为空，则要进行判定，如下
        /*StringBuffer sql = new StringBuffer("select * from hand_user where 1");
        if(!StringUtils.isNullOrEmpty(name)){
            // Sql.checkSql 的作用是防止sql注入
            sql.append(" and name = '").append(Sql.checkSql(name)).append("' ");
        }
        return queryForPage(sql.toString(), pageCurrent, pageSize, User.class);*/
        
        // 若要like查询，如下
        StringBuffer sql = new StringBuffer("select * from hand_user where 1");
        if(!StringUtils.isEmpty(name)){
            // Sql.checkSql 的作用是防止sql注入
            sql.append(" and name like '%").append(Sql.checkSql(name)).append("%' ");
        }
        return queryForPage(sql.toString(), pageCurrent, pageSize, User.class);
    }

}
