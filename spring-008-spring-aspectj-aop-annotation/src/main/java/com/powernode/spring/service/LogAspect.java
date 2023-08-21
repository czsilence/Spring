package com.powernode.spring.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Order(2)
@Component
@Aspect  //切面类是需要使用@Aspect注解进行标注的。
public class LogAspect { //切面

    //切面=通知+切点
    //通知就是增强，就是具体的要编写的增强代码


    //定义通用的切点表达式
    @Pointcut("execution(* com.powernode.spring.service..*(..))")
    public void test(){
        //这个方法只是一个标记，方法名随意，方法体也不需要写任何代码
    }


    //@Before注解标注的方法就是一个前置通知。
    @Before("test()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("前置通知！我是一段增强代码...");
        //JoinPoint joinPoint，在spring容器调用这个方法的时候自动传过来
        //我们可以直接使用，用这个JoinPoint joinPoint干啥？
        //Signature signature = joinPoint.getSignature();获取目标方法的签名
       //通过方法的签名可以获取到一个方法的具体信息
        System.out.println("目标方法的方法名："+joinPoint.getSignature().getName());
    }

    //后置通知
    @AfterReturning("test()")
    public void after(){
        System.out.println("后置通知！");
    }

    //环绕通知（环绕是最大的通知，在前置通知之前，在后置通知之后，在最终通知之前。）
    @Around("execution(* com.powernode.spring.service..*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        //前面的代码
        System.out.println("前环绕");
        //执行目标
        joinPoint.proceed(); //执行目标
        //后面的代码
        System.out.println("后环绕");
    }


    //异常通知（后环绕和后置通知不执行了）
    @AfterThrowing("test()")
        public void afterThrowing(){
        System.out.println("异常通知");
    }


    //最终通知
    @After("execution(* com.powernode.spring.service..*(..))")
    public void afterAdvice(){
        System.out.println("最终通知");
    }
}
