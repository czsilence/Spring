package com.powernode.spring.test;

import cn.powernode.Spring6Config;
import cn.powernode.service.StudentService;
import com.powernode.spring.bean.*;
import com.powernode.spring.bean3.MyDataSource;
import com.powernode.spring.bean3.Product;
import com.powernode.spring.dao.OrderDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCAnnotation {
    @Test
    public void testBean(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);

        Vip vipBean = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vipBean);

       /* Order serviceBean = applicationContext.getBean("serviceBean", Order.class);*/
        Order serviceBean = applicationContext.getBean("order", Order.class);
        System.out.println(serviceBean);

        /*Student studentBean = applicationContext.getBean("studentBean", Student.class);*/
        Student studentBean = applicationContext.getBean("student", Student.class);
        System.out.println(studentBean);

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        System.out.println(orderService);

        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);
    }


    @Test
    public void testBean2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-choose.xml");
    }


    @Test
    public void testBean3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testBean4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);
    }

    @Test
    public void testBean5(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-autowired.xml");
        org.powernode.service.OrderService orderService = applicationContext.getBean("orderService", org.powernode.service.OrderService.class);
        orderService.generate();
    }

    @Test
    public void testBean6(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-resource.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }

    @Test
    public void testBean7(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        StudentService studentService = annotationConfigApplicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }
}
