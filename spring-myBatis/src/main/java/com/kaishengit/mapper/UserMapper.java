package com.kaishengit.mapper;

import com.kaishengit.entity.User;

import java.util.List;

/**
 * Created by 王威 on 2017/7/11.
 */
public interface UserMapper {
    void save(User user);

    User findById(Integer id);

    List<User> findAll();
}
