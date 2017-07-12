package com.kaishengit.mapper;


import com.kaishengit.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 王威 on 2017/7/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void save() {
        User user = new User("JACK","华盛顿","123123",1);
        userMapper.save(user);
    }
}
