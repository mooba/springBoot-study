package com.pancm.conf;

import com.pancm.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * @author pengchengbai
 * @description
 * @date 2019-07-28 14:55
 */
public class UserConfTest3 {
    @Test
    public void getBean() {
        ApplicationContext context =
                new GenericGroovyApplicationContext("classpath:UserConfGroovy.groovy");
        System.out.println(System.getProperty("user.dir"));
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
