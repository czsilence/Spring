package com.powernode.spring.test;

import com.powernode.spring.biz.UserService;
import com.powernode.spring.biz.VipService;
import com.powernode.spring.service.AccountService;
import com.powernode.spring.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPRealAPPTest {
    @Test
    public void testAOP(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer();
        accountService.withdraw();

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
        orderService.cancel();
    }


    @Test
    public void testSecurityLog(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        VipService vipService = applicationContext.getBean("vipService", VipService.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);

        userService.saveUser();
        userService.deleteUser();
        userService.modifyUser();
        userService.getUser();

        vipService.saveVip();
        vipService.deleteVip();
        vipService.modifyVip();
        vipService.getVip();
    }
}
