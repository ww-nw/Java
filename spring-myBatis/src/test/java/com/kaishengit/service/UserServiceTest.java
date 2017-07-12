package com.kaishengit.service;

import com.github.pagehelper.PageInfo;
import com.kaishengit.com.kaishengit.service.UserService;
import com.kaishengit.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 王威 on 2017/7/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void save() {

        User user = new User("TOM","华盛顿","123123",1);
        userService.save(user);
    }

    @Test
    public void findById() {
        User user = userService.findById(1);
        System.out.println(user.getUserName());
    }

    @Test
    public void findByPage() {
        PageInfo<User> pageInfo = userService.findByPage(1, 5);
        List<User> userList = pageInfo.getList();
        for(User user : userList) {
            System.out.println(user);
        }
    }
}
