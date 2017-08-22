package com.lilei1998.inheritance.abstractClasses;

/**
 * Created by lilei on 2017/8/22 上午10:20.
 * Person 抽象类
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
