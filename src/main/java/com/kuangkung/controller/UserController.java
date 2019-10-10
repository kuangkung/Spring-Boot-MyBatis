package com.kuangkung.controller;

import com.kuangkung.entity.User;
import com.kuangkung.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public int insertUser(User user) {
        return userService.addUser(user);
    }

    @RequestMapping("/displayAll")
    public List<User> displayAll() {
        return userService.findAllUser();
    }

}
