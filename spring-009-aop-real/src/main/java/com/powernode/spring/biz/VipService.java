package com.powernode.spring.biz;

import org.springframework.stereotype.Service;

@Service
public class VipService {
    public void saveVip(){
        System.out.println("新增会员信息");
    }
    public void deleteVip(){
        System.out.println("删除会员信息");
    }
    public void modifyVip(){
        System.out.println("更改会员信息");
    }
    public void getVip(){
        System.out.println("查询会员信息");
    }
}
