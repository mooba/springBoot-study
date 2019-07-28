package com.pancm.conf;

import com.pancm.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pengchengbai
 * @description
 * @date 2019-07-28 14:24
 */
public class UserConfTest2 {
    @Test
    public void getBean() {

        // 通过一个带有config的pojo装载Bean配置
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConf.class);

        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
