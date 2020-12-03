package com.spring.firstspringboot.firstspringboot.controller;


import com.spring.firstspringboot.firstspringboot.dto.User;
import com.spring.firstspringboot.firstspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengtong
 * @date 2020/7/29
 **/
@RestController
public class UserController {
    @Autowired
    private UserService service;
    boolean flag;
    @RequestMapping("/login")
    public String login(User user) {

        flag= service.login(user);
        if (flag){
            return "main";
        } else{
            return "fail";
        }
    }

}
