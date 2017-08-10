package com.lilei1998.oop;

/**
 * Created by lilei on 2017/8/10 下午4:05.
 * java 方法参数按值调用
 */

class SimpleEmployee {
    private String name;
    private double salary;

    public SimpleEmployee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

public class ParamTest {
    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x = " + x);
    }

    public static void tripleSalary(SimpleEmployee x) {
        x.raiseSalary(200);
        System.out.println("End of method: x = " + x.getSalary());
    }

    public static void swap(SimpleEmployee x, SimpleEmployee y) {
        SimpleEmployee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x = " + x.getName());
        System.out.println("End of method: y = " + y.getName());
    }

    public static void main(String[] args) {

        // 一个方法不能修改一个基本数据类型的参数
        System.out.println("测试tripleSalary()方法：");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(10);
        System.out.println("After: percent = " + percent);

        System.out.println("----------------------");

        // 一个方法可以改变一个对象参数的状态
        System.out.println("测试tripleSalary()方法");
        SimpleEmployee harry = new SimpleEmployee("Harry", 50000);
        System.out.println("Before: salary = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = " + harry.getSalary());

        System.out.println("-----------------------");

        // 一个方法不能让对象参数引用一个新的对象
        System.out.println("测试swap()方法：");
        SimpleEmployee a = new SimpleEmployee("Alice", 70000);
        SimpleEmployee b = new SimpleEmployee("Bob", 60000);
        System.out.println("Before: a = " + a.getName());
        System.out.println("Before: b = " + b.getName());
        swap(a, b);
        System.out.println("After: a = " + a.getName());
        System.out.println("After: b = " + b.getName());
    }
}
