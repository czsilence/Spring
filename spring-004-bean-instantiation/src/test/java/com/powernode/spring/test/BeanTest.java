package com.powernode.spring.test;

import com.powernode.spring.bean.Gun;
import com.powernode.spring.bean.Person;
import com.powernode.spring.bean.Start;
import com.powernode.spring.bean.StartFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @Test
    public void testBean3(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
    @Test
    public void testBean2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = applicationContext.getBean("gun", Gun.class);
        System.out.println(gun);
    }
    @Test
    public void testBean(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Start sf = applicationContext.getBean("sf", Start.class);
        System.out.println(sf);
    }
}
