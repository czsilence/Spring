package com.powernode.spring.service;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) //数字小优先级高
public class SecurityAspect { //安全切面

    //通知+切点
    //@Before("execution(* com.powernode.spring.service..*(..))")
    @Before(" com.powernode.spring.service.LogAspect.test()")
    public void beforeAdvice(){
        System.out.println("前置通知：安全...");
    }
}
