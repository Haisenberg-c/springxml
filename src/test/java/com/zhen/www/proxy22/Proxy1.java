package com.zhen.www.proxy22;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Proxy1 implements InvocationHandler {
    private Object target;

   public Object newInstance(Object object){
       this.target=object;
       return Proxy.newProxyInstance(object.getClass().getClassLoader(),
               object.getClass().getInterfaces(), this
       );
   }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start---->代理类开始工作!!!");
        if(args!=null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
            Object invoke=null;
            try{
                System.out.println("建立数据库连接");
                System.out.println("开启事务");
                invoke = method.invoke(target, args);
                System.out.println("关闭事务");
                System.out.println("关闭连接");
            }catch(Exception e){
                System.out.println("发生了异常");
            }
         return invoke;

    }
}
