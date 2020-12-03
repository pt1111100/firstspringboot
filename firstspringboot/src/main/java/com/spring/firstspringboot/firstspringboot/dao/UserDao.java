package com.spring.firstspringboot.firstspringboot.dao;


import com.spring.firstspringboot.firstspringboot.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pengtong
 * @date 2020/7/29
 **/
public interface UserDao extends JpaRepository<User,Integer> {
   public User findByNameAndPasswd(String name, String passwd);
   public void insert(User user);
}
