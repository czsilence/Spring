package com.powernode.spring.service;

import com.powernode.spring.dao.UserDao;
import com.powernode.spring.dao.VipDao;


public class UserService {

    private UserDao userDao;
    private VipDao vipDao;

    //set注入的话，必须提供一个set方法
    //spring容器会调用这个set方法，来给UserDao属性赋值
    //不使用IDEA生成的，自己写一个set方法也行
    //这个方法至少是以set单词开始的，前三个字母不能随便写。
    /*public void setMySQLUserDao(UserDao userDao){
        this.userDao=userDao;
    }*/


    //这个set方法是IDEA生成的
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setMySpring(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void saveUser(){
        //保存用户信息到数据库
        userDao.insert();
        vipDao.insert();
    }


}
