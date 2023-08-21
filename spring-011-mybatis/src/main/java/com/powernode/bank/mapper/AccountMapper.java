package com.powernode.bank.mapper;

import com.powernode.bank.pojo.Account;

import java.util.List;

public interface AccountMapper { //该接口的实现类不需要写，是mybatis通过动态代理机制生成的实现类。

    //这就是DAO，只要编写CRUD方法即可
    int insert(Account account);

    int deleteByActno(String actno);

    int update(Account account);

    Account selectByActno(String actno);

    List<Account> selectAll();
}
