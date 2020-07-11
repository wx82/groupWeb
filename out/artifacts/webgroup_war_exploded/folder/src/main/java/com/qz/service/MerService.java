package com.qz.service;

import com.qz.pojo.Merchant;


import java.util.List;

public interface MerService {
    //增加商家
    int addMer(Merchant m);
    //删除商家
    int delMerById(int id);
    //修改商家
    int updateMer(Merchant m);
    //查找商家
    Merchant queryMerById(int id);
    //查询所有商家
    List<Merchant> queryAllMer();
}
