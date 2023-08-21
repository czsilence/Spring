package com.powernode.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    //注入list集合
    private List<String> names;

    //注入set集合
    private Set<String> addrs;

    //注入map集合，多个电话
    private Map<Integer,String> phones;

    //注入属性类对象，properties本质也是一个map集合，但和map注入方式有点不同
    private Properties properties;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                ", phones=" + phones +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }
}
