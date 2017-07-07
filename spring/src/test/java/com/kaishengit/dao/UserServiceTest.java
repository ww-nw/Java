package com.kaishengit.dao;

import com.kaishengit.service.DiDemo;
import com.kaishengit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王威 on 2017/7/7.
 */
public class UserServiceTest {
    @Test
    public void save(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();*/
        DiDemo diDemo = (DiDemo) applicationContext.getBean("diDemo");
        diDemo.show();
    }
}
