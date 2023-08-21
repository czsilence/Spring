package cn.powernode;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *编写一个类，代替spring框架的配置文件
 **/

@Configuration //这个注解就代表那个配置文件
@ComponentScan({"cn.powernode.dao","cn.powernode.service"})
public class Spring6Config {
}
