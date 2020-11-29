package com.spring.firstspringboot.firstspringboot.dto;

/**
 * @author pengtong
 * @date 2020/7/29
 **/
public class User {
    int id;
    String name;
    String passwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
