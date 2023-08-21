package com.powernode.simple.factory;

/**
 *这是客户端程序
 */
public class Test {
    public static void main(String[] args) {
        //需要坦克
        //对于客户端来说，坦克的生产细节不需要关心，只需要向工厂索要即可
        //简单工厂模式达到职责分离，客户端不需要关心产品的生产细节
        //客户端只负责消费，工厂类负责生产，生产者和消费者分离了，这就是工厂模式的作用
        Weapon tank=  WeaponFactory.get("TANK");
        tank.attack();
        //需要匕首
        Weapon dagger=  WeaponFactory.get("DAGGER");
        dagger.attack();
        //需要战斗机
         Weapon fighter=  WeaponFactory.get("FIGHTER");
         fighter.attack();
    }
}
