package com.powernode.spring.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {


    /*@Value("陈阵")*/
    private String name;
    /*@Value("23")*/
    private int age;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //@Value注解也可以用在方法上
   /* @Value("陈阵")
    public void setName(String name) {
        this.name = name;
    }

    @Value("23")
    public void setAge(int age) {
        this.age = age;
    }*/

    //@Value注解也可以用在构造方法上
    public Product(@Value("陈阵")String name,@Value("22") int age) {
        this.name = name;
        this.age = age;
    }
}
