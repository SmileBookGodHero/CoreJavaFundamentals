package com.lilei1998.oop;

import java.util.Random;

/**
 * Created by lilei on 2017/8/14 下午4:41.
 *
 * 重载构造器
 * 用 this(...) 调用另一个构造器
 * 无参数构造器
 * 对象初始化块
 * 静态初始化块
 * 实例域初始化
 */

public class ConstructorTest {
    public static void main(String[] args) {
        EmployeeExample[] staff = new EmployeeExample[3];

        staff[0] = new EmployeeExample("Harry",40000);
        staff[1] = new EmployeeExample(60000);
        staff[2] = new EmployeeExample();

        for (EmployeeExample employeeExample : staff) {
            System.out.println("name = " + employeeExample.getName()
            + ", id = " + employeeExample.getId()
            + ", salary = " + employeeExample.getSalary());
        }
    }
}

class EmployeeExample {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static {    // 随机数生成器
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public EmployeeExample(String n, double s) {
        name = n;
        salary = s;
    }

    public EmployeeExample(double s) {
        this("Employee #" + nextId, s);
    }

    public EmployeeExample() {   // 默认构造器
        // name 初始化为 ""
        // salary 初始化为 0
        // id 初始化为 初始化块
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
