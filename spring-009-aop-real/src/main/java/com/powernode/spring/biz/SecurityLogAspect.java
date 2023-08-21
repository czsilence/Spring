package com.powernode.spring.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class SecurityLogAspect {

    @Pointcut("execution(* com.powernode.spring.biz..save*(..))")
    public void savePointcut(){}

    @Pointcut("execution(* com.powernode.spring.biz..delete*(..))")
    public void deletePointcut(){}

    @Pointcut("execution(* com.powernode.spring.biz..modify*(..))")
    public void modifyPointcut(){}

    //
    @Before("savePointcut()||deletePointcut()||modifyPointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        //系统时间
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTime = simpleDateFormat.format(new Date());
        //输出日志信息
        System.out.println(nowTime+"zhangsan"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

    }
}
