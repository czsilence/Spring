package com.powernode.spring.bean;

public class Women {
    private String name;

    @Override
    public String toString() {
        return "Women{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
