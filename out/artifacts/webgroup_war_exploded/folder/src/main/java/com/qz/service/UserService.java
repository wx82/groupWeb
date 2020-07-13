package com.qz.service;

import com.qz.pojo.User;

import java.util.List;

public interface UserService {
    //增加商家
    int addUser(User m);
    //删除商家
    int delUserById(int id);
    //修改商家
    int updateUser(User m);
    //查找商家
    User queryUserById(int id);
    //查询所有商家
    List<User> queryAllUser();
}
