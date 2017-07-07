package com.kaishengit.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王威 on 2017/7/7.
 */
public class UserDaoTest {
    @Test
    public void save() {
        //创建spring容器,并从classpath中读取spring的配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       //从容器中获取对象
       /* UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");

        System.out.println(userDao == userDao2);*/
        // userDao.save();

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
        //applicationContext.close();
    }
}
