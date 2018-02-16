package com.wlsq.apple.controller;


import com.wlsq.apple.entity.User;
import com.wlsq.apple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        System.out.println("sss");
        List<User> list = userService.getAllUsers();
        return userService.getAllUsers();
    }
}
