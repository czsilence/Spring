package com.powernode.spring.bean;


import org.springframework.stereotype.Repository;

@Repository
public class Student {
}


/*
 *以上这个注解@Repository就相当于以下的这个配置信息
 * <bean id="student" class="com.powernode.spring.bean.Student"/>
 *
 */
