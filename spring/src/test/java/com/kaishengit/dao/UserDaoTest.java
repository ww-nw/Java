package com.kaishengit.dao;

import com.kaishengit.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 王威 on 2017/7/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void save() {
        User user = new User();
        user.setUser_name("bbb");
        user.setPassword("123123");
        user.setAddress("北京");
        user.setDept_id(1);

        userDao.save(user);
    }

    @Test
    public void findById() {
        User user = userDao.findById(1);
        Assert.assertNotNull(user);
    }








  /*  public void save() {
        //创建spring容器,并从classpath中读取spring的配置文件
       // ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ApplicationContext.class);
        //从容器中获取对象
       *//* UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");

        System.out.println(userDao == userDao2);*//*
        // userDao.save();

        UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean("UserDao");
        userDao.save();
        //applicationContext.close();
    }*/
}
