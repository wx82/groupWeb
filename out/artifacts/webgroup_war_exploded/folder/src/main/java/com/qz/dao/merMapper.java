package com.qz.dao;

import com.qz.pojo.Merchant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface merMapper {
    //增加商家
    int addMer(Merchant m);
    //删除商家
    int delMerById(@Param("mid") int id);
    //修改商家
    int updateMer(Merchant m);
    //查找商家
    Merchant queryMerById(@Param("mid") int id);
    //查询所有商家
    List<Merchant> queryAllMer();
}
