package com.kaishengit.service;

import com.kaishengit.dao.UserDao;
import com.kaishengit.dao.WeiXinDao;
import com.kaishengit.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * Created by 王威 on 2017/7/7.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Transactional
    public void save(User user) throws SQLException {
        userDao.save(user);

    }










     /* @Autowired
    private WeiXinDao weiXinDao;*/

   /* public UserService(UserDao userDao, WeiXinDao weiXinDao) {
        this.userDao = userDao;
        this.weiXinDao = weiXinDao;
    }*/

  /*  public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void setWeiXinDao(WeiXinDao weiXinDao) {
        this.weiXinDao = weiXinDao;
    }*/
}

