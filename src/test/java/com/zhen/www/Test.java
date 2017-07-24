package com.zhen.www;

import com.zhen.www.bean.Attractions;
import com.zhen.www.bean.VisaCountry;
import com.zhen.www.service.impl.IServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

/**
 * Created by caiwei on 2017/7/18.
 */
public class Test {

    @org.junit.Test
    public  void hello() {
        System.out.println("测试开始···");
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("config/applicationContext.xml");
        IServiceImpl bean = (IServiceImpl) beanFactory.getBean(IServiceImpl.class);
        List<VisaCountry> attactions = bean.findAttactions();
        Iterator<VisaCountry> iterator = attactions.iterator();
        while(iterator.hasNext()){
            VisaCountry entity = iterator.next();
            System.out.println(entity.toString());
        }
    }
}
