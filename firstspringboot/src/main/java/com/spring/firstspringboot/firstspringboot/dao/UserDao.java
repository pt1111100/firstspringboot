package com.spring.firstspringboot.firstspringboot.dao;


import com.spring.firstspringboot.firstspringboot.dto.User;

/**
 * @author pengtong
 * @date 2020/7/29
 **/
public interface UserDao {
    User search(User user);
    void insert(User user);
}
