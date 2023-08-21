package com.powernode.spring.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstSpringTest {

    @Test
    public void testBeginInitBean(){
        //自己怎么去使用log4j2记录日志信息呢？
        //第一步：创建日志记录器对象
        //获取FirstSpringTest类的日志记录器对象，也就是说只要是FirstSpringTest类的代码执行记录日志的话，就输出相关的日志信息
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);


        //第二步：记录日志，根据不同的级别来输出日志
        logger.info("我是一条消息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条错误信息");
    }



    @Test
    public void testFirstSpringTest(){
        //第一步：获取spring的容器对象
        //ApplicationContext：应用上下文。其实就是spring容器
        //ApplicationContext是一个接口，该接口下有很多实现类，其中一个实现类叫做：ClassPathXmlApplicationContext
        //ApplicationContext接口的超级父接口是：BeanFactory(翻译为Bean工厂，就是能生产Bean对象的一个工厂对象)
        //BeanFactory是IOC容器的顶级接口
        //spring底层的IOC是怎么实现的？XML解析+工厂模式+反射机制
        //ClassPathXmlApplicationContext专门从类路径当中加载spring配置文件的一个spring上下文对象。
        //这行代码只要执行，就相当于启动spring容器，解析spring.xml文件，并且实例化所有的bean对象，放到spring容器当中
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");

        //第二步：根据bean的id从spring容器中获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);


        //Object nowTime = applicationContext.getBean("nowTime");
        Date nowTime = (Date)applicationContext.getBean("nowTime");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SS");
        String format = sdf.format(nowTime);
        System.out.println(format);

        //不想强制类型转换，可以使用以下代码(通过第二个参数来指定返回的bean的类型)
        Date nowTime1 = applicationContext.getBean("nowTime", Date.class);
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SS");
        String format1 = sdf1.format(nowTime);
        System.out.println(format1);
    }
}
