package com.powernode.proxy.service;

/**
 *订单业务接口
 **/
public interface OrderService {
    //生成订单
    void generate();

    //修改订单信息
    void modify();

    //查看订单信息
    void detail();
}
