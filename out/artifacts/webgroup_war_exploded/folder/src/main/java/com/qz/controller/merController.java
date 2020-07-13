package com.qz.controller;

import com.qz.pojo.Merchant;
import com.qz.service.MerService;
import com.qz.service.MerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/merchant")

public class merController {
    //controller层调用service层
    @Autowired
    //括号中填写-service中的beanID
    @Qualifier("MerServiceImp")
    private MerService merService = new MerServiceImp();
    //查询商家展示
    @RequestMapping("/allmer")
    public String list(Model model){
        List<Merchant> list = merService.queryAllMer();
        model.addAttribute("list",list);
        return "allmer";
    }
}

