package com.powernode.spring.service;

import com.powernode.spring.dao.OrderDao;

public class OrderService {

    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate(){
        orderDao.generate();
    }
}
