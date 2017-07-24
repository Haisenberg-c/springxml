package com.zhen.www;

import com.zhen.www.bean.User;
import org.junit.*;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by caiwei on 2017/7/18.
 */
public class userTest {
  public static BeanFactory factory;
    @Before
   public void setUp(){
         factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");

    }
   @Test
   public void userTest(){
       User usid = (User) factory.getBean(User.class);
       System.out.println(usid);
   }
}
