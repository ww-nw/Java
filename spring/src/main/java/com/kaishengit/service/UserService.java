package com.kaishengit.service;

import com.kaishengit.dao.UserDao;
import com.kaishengit.dao.WeiXinDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 王威 on 2017/7/7.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private WeiXinDao weiXinDao;

    public void save() {
        userDao.save();
    }

   /* public UserService(UserDao userDao, WeiXinDao weiXinDao) {
        this.userDao = userDao;
        this.weiXinDao = weiXinDao;
    }*/

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void setWeiXinDao(WeiXinDao weiXinDao) {
        this.weiXinDao = weiXinDao;
    }
}

