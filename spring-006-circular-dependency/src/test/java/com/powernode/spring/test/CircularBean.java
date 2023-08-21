package com.powernode.spring.test;

import com.powernode.spring.bean.Husband;
import com.powernode.spring.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularBean {
    @Test
    public void testBean(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Husband husbandBean = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(wifeBean);
    }

    @Test
    public void testBean2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring2.xml");
        Husband husbandBean = applicationContext.getBean("h", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("W", Wife.class);
        System.out.println(wifeBean);
    }
}
