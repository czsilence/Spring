package com.powernode.spring.bean;
/**
 *工厂方法中的具体工厂角色
 */
public class GunFactory {
    //工厂方法模式中的具体工厂角色中的方法是实例化的
    public Gun get(){
        return new Gun();
    }
}
