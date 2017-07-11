package com.kaishengit.dao;

import com.kaishengit.Application;
import com.kaishengit.entity.User;
import com.kaishengit.service.DiDemo;
import com.kaishengit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 王威 on 2017/7/7.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void save() throws Exception {
        System.out.println(userService);
        User user = new User();
        user.setUser_name("aaa");
        user.setPassword("123123");
        user.setAddress("北京");
        user.setDept_id(1);

        userService.save(user);

    }




   /* @Test
    public void save(){

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
        *//*DiDemo diDemo = (DiDemo) applicationContext.getBean("diDemo");
        diDemo.show();*//*
    }*/
}
