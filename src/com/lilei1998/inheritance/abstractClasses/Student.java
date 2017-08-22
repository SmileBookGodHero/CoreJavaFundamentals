package com.lilei1998.inheritance.abstractClasses;

/**
 * Created by lilei on 2017/8/22 上午10:36.
 * 继承 Person 类
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "a student majoring in " + major;
    }
}
