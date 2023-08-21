package org.powernode.impl;

import org.powernode.dao.OrderDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class OrderDaoImplFoeOracle implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Oracle数据库正在保存订单信息");
    }
}
