package com.pancm.conf;

import com.pancm.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengchengbai
 * @description
 * @date 2019-07-25 23:30
 */
@Configuration
public class UserConf {

    @Bean(name = "user")
    public User getUser() {
        User user = new User();
        user.setName("allan");
        user.setId(1);
        user.setAge(18);
        return user;
    }
}
