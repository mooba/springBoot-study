package cn.allan.moduleweb.controller;


import cn.allan.moduledao.User;
import cn.allan.moduleservice.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public User addUser() {
        log.info("calling /add to add user");
        User user = new User();
        user.setName("libai");
        user.setAge(31);
        return userService.addOne(user);
    }
}
