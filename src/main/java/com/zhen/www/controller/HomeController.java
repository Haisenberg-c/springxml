package com.zhen.www.controller;


import com.zhen.www.service.impl.IServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Resource
    private IServiceImpl serviceimpl;
    @RequestMapping("/data")
    @ResponseBody
    public String loadHomeData(String name){
        System.out.println(name);
        return name;
    }




}
