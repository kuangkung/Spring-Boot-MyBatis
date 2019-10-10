package com.kuangkung.service;

import com.kuangkung.entity.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser();

}
