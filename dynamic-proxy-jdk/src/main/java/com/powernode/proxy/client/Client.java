package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.TimerInvocationHandler;
import com.powernode.proxy.utils.ProxyUtil;

import java.lang.reflect.Proxy;

public class Client {
    //客户端程序
    public static void main(String[] args) {

        //创建目标对象
        OrderService target=new OrderServiceImpl();
        //创建代理对象
        /*
        * Proxy.newProxyInstance();方法的执行做了两件事：
        * 第一件事：在内存中动态生成了一个代理类的字节码class
        * 第二件事：new对象了，通过内存中生成的代理类这个代码，实例化了代理对象
        *
        * 关于Proxy.newProxyInstance()方法的三个参数，每个什么含义，有什么用？
        * 第一个参数：ClassLoader loader
        *              类加载器。这个类加载器有什么用？
        *                  在内存当中生成的字节码也是class文件，要执行也要先加载到内存当中加载类就需要类加载器
        *                   并且jdk要求，目标类的类加载器必须和代理类的类加载器使用同一个
        * 第二个参数：Class<?>[] interfaces
        *               代理类要和目标类实现同一个接口或同一些接口。
        *               在内存中生成代理类的时候，这个代理类是需要你告诉它实现哪些接口的
        * 第三个参数：InvocationHandler h
        *               被翻译为调用处理器，是一个接口。
        *               在调用处理器接口中编写的就是：增强代码
        *               因为具体要增强什么代码，jdk动态代理技术是猜不到的，要写接口的实现类。
        *
        * 这种调用处理器写一次就好，不会导致类爆炸
        * 注意：代理对象和目标对象实现的接口一样，可以向下转型
        **/
        /*OrderService proxyObj = (OrderService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),new TimerInvocationHandler(target));*/


        OrderService proxyObj = (OrderService)ProxyUtil.newProxyInstance(target);
        //调用代理对象的代理方法
        //注意：调用代理对象的代理方法的时候，如果你要做增强的话，目标对象的目标方法得保证执行
        proxyObj.generate();
        proxyObj.detail();
        proxyObj.modify();

    }
}
