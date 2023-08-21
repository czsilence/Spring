package com.powernode.bank.service;

import com.powernode.bank.pojo.Account;
import org.springframework.stereotype.Component;

import java.util.List;


public interface AccountService {

    /**
     *开户
     **/
    int save(Account act);

    /**
     *销户
     **/
    int deleteByActno(String actno);

    /**
     *修改账户
     **/
    int modify(Account account);

    /**
     *查询账户
     **/
    Account getByActno(String actno);

    /**
     *查询所有账户
     **/
    List<Account> getAll();

    /**
     *转账
     **/
    void transfer(String fromActno,String toActno,double money);
}
