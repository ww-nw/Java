package com.kaishengit.dao;

import com.kaishengit.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 王威 on 2017/7/7.
 */
@Repository
//@Named
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user) {
        String sql = "insert into t_user(user_name,password,address,dept_id) values(?,?,?,?)";
        jdbcTemplate.update(sql,user.getUser_name(),user.getPassword(),user.getAddress(),user.getDept_id());
    }

    public User findById(Integer id) {
        String sql = "select * from t_user where id = ?";
        return jdbcTemplate.queryForObject( sql, new UserRowMapper(),id);
    }




    private class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setUser_name(resultSet.getString("user_name"));
            user.setDept_id(resultSet.getInt("dept_id"));
            user.setAddress(resultSet.getString("address"));
            user.setPassword(resultSet.getString("password"));
            user.setId(resultSet.getInt("id"));
            return user;
        }
    }








   /* public UserDao () {
        System.out.println("create userDao");
    }*/

   /* public void init() {
        System.out.println("init method");
    }

    public void destroy() {
        System.out.println("destroy method");
    }*/

   /* public void save() {
        System.out.println("userDao saved.....");
    }*/
}
