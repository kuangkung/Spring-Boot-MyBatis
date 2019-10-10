package com.kuangkung.service.impl;

import com.kuangkung.dao.UserDao;
import com.kuangkung.entity.User;
import com.kuangkung.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.selectAllUser();
    }
}
