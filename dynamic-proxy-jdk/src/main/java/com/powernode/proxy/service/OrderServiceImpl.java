package com.powernode.proxy.service;

public class OrderServiceImpl implements OrderService {
    @Override
    public void generate() {

        //模拟生成订单的耗时
        try{
            Thread.sleep(1234);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("订单已生成");

    }

    @Override
    public void modify() {

        //模拟生成订单的耗时
        try{
            Thread.sleep(1234);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("订单以修改");

    }

    @Override
    public void detail() {

        //模拟生成订单的耗时
        try{
            Thread.sleep(1234);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("请看订单详情");

    }
}
