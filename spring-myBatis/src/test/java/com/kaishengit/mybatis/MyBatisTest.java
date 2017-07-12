package com.kaishengit.mybatis;

import com.kaishengit.entity.User;
import com.kaishengit.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
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
public class MyBatisTest {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public void save() {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User("ROSE","华盛顿","123123",1);
        userMapper.save(user);

        sqlSession.commit();
        sqlSession.close();
    }
}
