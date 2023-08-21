package com.powernode.spring.test;

import com.powernode.bank.service.AccountService;
import com.powernode.bank.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMybatisTest {
    @Test
    public void testSpringMybatisTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try{
            accountService.transfer("1","2",20000);
            System.out.println("转账成功");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
