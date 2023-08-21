package com.powernode.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 *bean的生命中周期按照粗略的五步的话：
 * 第一步：实例化bean（调用无参构造）
 * 第二步：给bean属性赋值（调用set方法）
 * 第三步：初始化bean（调用bean的init方法。这个initial方法需要自己写，自己配）
 * 第四步：使用bean
 * 第五步：销毁bean（调用bean的destroy方法，这个方法需要自己写，自己配）
 */
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean {
    private String name;

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值");
        this.name = name;
    }

    public User(){
        System.out.println("第一步：无参数构造方法执行");
    }

    //这个方法需要自己写，自己配，方法名随意
    public void initBean(){
        System.out.println("第四步：初始化bean");
    }

    //这个方法需要自己写，自己配，方法名随意
    public void destroyBean(){
        System.out.println("第七步：销毁bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("这个bean的加载器："+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产这个bean的工厂对象是"+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("这个bean的名字"+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean is afterPropertiesSet方法执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean is destroy方法执行");
    }
}
