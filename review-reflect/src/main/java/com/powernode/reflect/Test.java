package com.powernode.reflect;

import java.lang.reflect.Method;

/**
 *使用反射机制调用方法
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //使用反射机制调用方法
        //获取类
        Class<?> clazz = Class.forName("com.powernode.reflect.SomeService");

        //获取方法
        Method doSome = clazz.getDeclaredMethod("doSome", String.class, int.class);

        //调用方法
        Object obj = clazz.newInstance();
        Object ret = doSome.invoke(obj, "李四", 250);
        System.out.println(ret);
    }
}
