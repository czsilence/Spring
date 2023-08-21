package com.powernode.spring.service;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //代替spring.xml文件
@ComponentScan({"com.powernode.spring.service"}) //组件扫描
@EnableAspectJAutoProxy(proxyTargetClass=true) //启动aspectj的动态代理机制
public class Spring6Config {
}
