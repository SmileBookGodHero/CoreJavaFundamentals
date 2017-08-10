package com.lilei1998.oop;

/**
 * Created by lilei on 2017/8/10 下午2:57.
 */

class EmployeeDemo {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public EmployeeDemo(String n, double s) {
        name = n;
        salary = s;
        id = 0;
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

    public void setId() {
        id = nextId;   // 把id设置为nextId
        nextId++;
    }

    public static int getNextId() {     // 返回静态域
        return nextId;
    }

    public static void main(String[] args) {
        EmployeeDemo e = new EmployeeDemo("Harry", 5000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}

public class StaticTest {
    public static void main(String[] args) {
        EmployeeDemo[] staff = new EmployeeDemo[3];

        staff[0] = new EmployeeDemo("Tom", 40000);
        staff[1] = new EmployeeDemo("Dick", 60000);
        staff[2] = new EmployeeDemo("Harry", 80000);

        for (EmployeeDemo e : staff) {
            e.setId();
            System.out.println("name : " + e.getName() + ", id = " + e.getId() + ", salary : " + e.getSalary());
        }
    }
}
