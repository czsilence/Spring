package com.powernode.factory.method;
/**
 *具体工厂角色
 */
public class GunFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Gun();
    }
}
