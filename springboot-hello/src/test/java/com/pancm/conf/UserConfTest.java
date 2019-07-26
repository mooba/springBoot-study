package com.pancm.conf;

import com.pancm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserConfTest {
    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void getUserBeanTest() {
        User user = beanFactory.getBean("user", User.class);
        System.out.println(user);
    }
}