package com.kaishengit.dao;

import javafx.beans.NamedArg;
import org.springframework.stereotype.Repository;

import javax.inject.Named;

/**
 * Created by 王威 on 2017/7/7.
 */
//@Repository
@Named
public class UserDao {
    public UserDao () {
        System.out.println("create userDao");
    }

   /* public void init() {
        System.out.println("init method");
    }

    public void destroy() {
        System.out.println("destroy method");
    }*/

    public void save() {
        System.out.println("userDao saved.....");
    }
}
