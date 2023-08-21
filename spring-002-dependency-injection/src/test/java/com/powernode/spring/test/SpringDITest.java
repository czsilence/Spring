package com.powernode.spring.test;

import com.powernode.spring.bean.Cat;
import com.powernode.spring.bean.Person;
import com.powernode.spring.bean.QianDaYe;
import com.powernode.spring.bean.User;
import com.powernode.spring.jdbc.MyDataSource1;
import com.powernode.spring.jdbc.MyDataSource2;
import com.powernode.spring.jdbc.MyDateSource;
import com.powernode.spring.service.CustomerService;
import com.powernode.spring.service.OrderService;
import com.powernode.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {

    @Test
    public void testProperty(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDateSource ds = applicationContext.getBean("ds", MyDateSource.class);
        System.out.println(ds);
    }


    @Test
    public void testAuto(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowire.xml");
       /*OrderService ds1 = applicationContext.getBean("OrderService", OrderService.class);
        System.out.println(ds1);*/
        CustomerService customerService = applicationContext.getBean("cs", CustomerService.class);
        System.out.println(customerService);
    }

    @Test
    public void testUtil(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-util-dataSource.xml");
        MyDataSource1 ds1 = applicationContext.getBean("ds1", MyDataSource1.class);
        System.out.println(ds1);

        MyDataSource2 ds2 = applicationContext.getBean("ds2", MyDataSource2.class);
        System.out.println(ds2);
    }

    @Test
    public void testCat(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        Cat cat = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat);
    }

    @Test
    public void testCollection(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-person-collection.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void testArray(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-array.xml");
        QianDaYe yuQian = applicationContext.getBean("yuQian", QianDaYe.class);
        System.out.println(yuQian);
    }

    @Test
    public void testMyDataSource(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        MyDateSource myDateSourceBean = applicationContext.getBean("MyDateSourceBean", MyDateSource.class);
        System.out.println(myDateSourceBean);
    }


    @Test
    public void testSetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("UserServiceBean", UserService.class);
        userService.saveUser();
    }

    @Test
    public void testConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        CustomerService customerService = applicationContext.getBean("customerServiceBean", CustomerService.class);
        customerService.save();

        CustomerService customerService2 = applicationContext.getBean("customerServiceBean2", CustomerService.class);
        customerService2.save();

        CustomerService customerService3 = applicationContext.getBean("customerServiceBean3", CustomerService.class);
        customerService3.save();
    }

    @Test
    public void testSetDI2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderServiceBean = applicationContext.getBean("OrderServiceBean", OrderService.class);
        orderServiceBean.generate();

        OrderService orderServiceBean2 = applicationContext.getBean("OrderServiceBean2", OrderService.class);
        orderServiceBean2.generate();
    }


    @Test
    public void testSetDI3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);

    }
}
