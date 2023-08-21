package com.powernode.spring.test;

import com.powernode.spring.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopeTest {
    /**
     *1.spring默认情况下是如何管理bean的：
     *  默认情况下bean是单例的
     *  在spring上下文初始化的时候实例化
     *  每一次调用getBean()方法的时候，都返回那个单例的对象
     * 2.当将bean的scope属性设置为prototype：
     * bean是多例的
     * spring上下文初始化的时候，并不会初始化这些prototype的bean
     * 每一次调用getBean()方法的时候，实例化该bean对象
     */
    @Test
    public void testBeanScope(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean bean = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(bean);

        SpringBean bean2 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(bean2);

        SpringBean bean3 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(bean3);
    }
}
