package com.powernode.factory.method;
/**
 *客户端程序
 */
public class Test {
    public static void main(String[] args) {
        WeaponFactory weaponFactory=new DaggerFactory();
        WeaponFactory weaponFactory1=new GunFactory();
        weaponFactory.get().attack();
        weaponFactory1.get().attack();
    }
}
