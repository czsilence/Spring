package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.OrderServiceProxy;

public class Test {
    public static void main(String[] args) {
        /*OrderService orderService=new OrderServiceImpl();
        orderService.generate();
        orderService.detail();
        orderService.modify();*/

        //以下采用静态代理模式，解决了OCP问题，但是会产生类爆炸，也不好维护。这时有个动态代理可以解决
        //创建目标对象
        OrderService target =new OrderServiceImpl();
        //创建代理对象
        OrderService proxy=new OrderServiceProxy(target);
        //调用代理对象的代理方法
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
}
