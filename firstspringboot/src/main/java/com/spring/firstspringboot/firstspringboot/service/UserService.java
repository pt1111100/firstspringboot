package com.spring.firstspringboot.firstspringboot.service;


import com.spring.firstspringboot.firstspringboot.dto.User;

/**
 * @author pengtong
 * @date 2020/7/29
 **/
public interface UserService {
    boolean login(User user);
    void  register(User user);
}
