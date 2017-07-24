package com.zhen.www.dao;

import com.zhen.www.proxy22.Proxy1;

public class MainTest {


    public static void main(String[] args) {
        IDaoTest daoTest = (IDaoTest) new Proxy1().newInstance(new IDaoTestImpl());
        daoTest.saveInfo();

    }
}
