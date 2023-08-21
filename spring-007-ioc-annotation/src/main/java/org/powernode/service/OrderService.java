package org.powernode.service;

import org.powernode.dao.OrderDao;
import org.powernode.impl.OrderDaoImplForMySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    //@Autowired注解使用的时候，不需要指定任何属性，直接使用这个注解即可
    //这个注解的作用是根据类型byType进行自动装配

    //@Autowired
    //private OrderDao orderDao;

    //如果想解决多个类实现一个接口，只能根据名字进行装配
    //@Autowired和@Qualifier联合使用，可以根据名字装配

    @Autowired
    @Qualifier("dao")
    //@Qualifier("order")
    private OrderDao orderDao;

    //@Autowired @Qualifier也可以在构造方法和setter方法上执行
    public void generate(){
        orderDao.insert();
    }
}
