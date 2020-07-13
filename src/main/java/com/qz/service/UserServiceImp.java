package com.qz.service;

import com.qz.dao.userMapper;
import com.qz.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    //service调dao层
    private userMapper usermapper;

    public void setUsermapper(userMapper usermapper) {
        this.usermapper = usermapper;
    }

    public int addUser(User m) {
        return usermapper.addUser(m);
    }

    public int delUserById(int id) {
        return usermapper.delUserById(id);
    }

    public int updateUser(User m) {
        return usermapper.updateUser(m);
    }

    public User queryUserById(int id) {
        return usermapper.queryUserById(id);
    }

    public List<User> queryAllUser() {
        return usermapper.queryAllUser();
    }
}
