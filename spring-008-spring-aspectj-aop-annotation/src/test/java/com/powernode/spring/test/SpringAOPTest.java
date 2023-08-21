package com.powernode.spring.test;

import com.powernode.spring.service.OrderService;
import com.powernode.spring.service.Spring6Config;
import com.powernode.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest {
    @Test
    public void testBefore(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");


       /* UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
        userService.logOut();*/

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }


    @Test
    public void testNoXml(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Spring6Config.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}
