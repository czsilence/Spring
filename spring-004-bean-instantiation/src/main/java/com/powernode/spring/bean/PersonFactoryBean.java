package com.powernode.spring.bean;

import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean<Person> {
    //PersonFactoryBean也是一个bean，只不过这个bean比较特殊，叫做工厂bean
    //通过工厂bean可以获取普通的bean

    @Override
    public Person getObject() throws Exception {
        //最终这个bean的创建还是程序员自己new的
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }


    //这个方法在接口中有默认实现
    //默认返回true，表示单例的
    //如果想多例，直接将这个方法修改为return false；
    @Override
    public boolean isSingleton() {
        return true;
    }
}
