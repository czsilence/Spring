package com.powernode.spring.bean;

public class User {
    //spring是怎么实例化的
    //默认情况下spring会通过反射机制，调用类的无参构造方法来实例化对象
    //实力原理如下：
    //Clazz clazz=Clazz.forName("com.powernode.spring.bean.User");
    //Object obj=clazz.newInstance();
    public User(){
        System.out.println("User的无参构造方法执行");
    }
}
