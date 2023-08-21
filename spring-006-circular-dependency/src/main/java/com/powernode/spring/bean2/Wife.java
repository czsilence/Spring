package com.powernode.spring.bean2;

public class Wife {
    private String name;
    private Husband husband;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }

    public Wife(String name, Husband husband) {
        this.name = name;
        this.husband = husband;
    }
}
