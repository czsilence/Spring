package com.powernode.spring.test;

import com.powernode.spring.bean.Student;
import com.powernode.spring.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @Test
    public void testBean2(){
        Student student =new Student();
        //将以上自己new的这个对象纳入spring容器来管理，半路交给spring来管理
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        factory.registerSingleton("s",student);
        //从spring容器中获取
        Object s = factory.getBean("s");
        System.out.println(s);
    }

    /**
     *spring容器只对singleton（单例，每获取getBean都是这一个对象）的bean进行完整的生命周期
     * 如果是prototype（获取一个getBean是一个新的对象）作用域的bean，spring只负责将bean初始化完毕，
     * 等客户端程序一旦获取到该bean之后，spring容器就不在管理该对象的生命周期
     */
    @Test
    public void testBean(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第六步：使用Bean："+user);

        //注意：必须手动关闭spring容器，这样spring容器才会销毁bean
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
}
