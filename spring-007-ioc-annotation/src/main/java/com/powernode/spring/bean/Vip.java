package com.powernode.spring.bean;


import org.springframework.stereotype.Controller;

@Controller("vipBean")//如果属性名是value，value可以省略
public class Vip {
}

/*
 *以上这个注解@Controller(""vipBean)就相当于以下的这个配置信息
 * <bean id="vipBean" class="com.powernode.spring.bean.Vip"/>
 *
 */
