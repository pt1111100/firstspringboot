package com.spring.firstspringboot.firstspringboot.service.Impl;
import com.spring.firstspringboot.firstspringboot.dao.UserDao;
import com.spring.firstspringboot.firstspringboot.dto.User;
import com.spring.firstspringboot.firstspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pengtong
 * @date 2020/7/29
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean login(User user) {
        boolean flag= false;
         User i = userDao.findByNameAndPasswd(user.getName(),user.getPasswd());
         if (i !=null){
            flag= true;
            return flag;
         }
        return flag;
    }

    @Override
    public void register(User user) {

        userDao.insert(user);
    }
}
