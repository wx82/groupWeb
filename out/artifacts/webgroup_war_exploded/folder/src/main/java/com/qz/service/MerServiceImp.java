package com.qz.service;

import com.qz.dao.merMapper;
import com.qz.pojo.Merchant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MerServiceImp implements MerService{
    //service调dao层
    private merMapper mermapper;

    public void setMermapper(merMapper mermapper) {
        this.mermapper = mermapper;
    }

    public int addMer(Merchant m) {
        return mermapper.addMer(m);
    }

    public int delMerById(int id) {
        return mermapper.delMerById(id);
    }

    public int updateMer(Merchant m) {
        return mermapper.updateMer(m);
    }

    public Merchant queryMerById(int id) {
        return mermapper.queryMerById(id);
    }

    public List<Merchant> queryAllMer() {
        return mermapper.queryAllMer();
    }
}
