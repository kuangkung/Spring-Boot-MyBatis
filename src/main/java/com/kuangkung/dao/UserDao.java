package com.kuangkung.dao;

import com.kuangkung.entity.User;

import java.util.List;

public interface UserDao {

    int insert(User record);

    List<User> selectAllUser();

}