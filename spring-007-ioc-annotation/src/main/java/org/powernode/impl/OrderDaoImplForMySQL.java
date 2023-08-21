package org.powernode.impl;

import org.powernode.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository("order")
public class OrderDaoImplForMySQL implements OrderDao {
    @Override
    public void insert() {
        System.out.println("MySQL数据库正在保存订单信息...");
    }
}
