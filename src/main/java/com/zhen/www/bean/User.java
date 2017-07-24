package com.zhen.www.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by caiwei on 2017/7/18.
 */
@Component
public class User {
    private Integer id;
    private  String name;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
