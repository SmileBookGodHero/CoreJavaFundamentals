package com.lilei1998.oop;

import java.time.LocalDate;

/**
 * Created by lilei on 2017/8/10 上午11:12.
 */

class Employee {
    private String name;   //  数据标记为private，确保只有Employee类自身的方法能够访问这些实例域
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {   // Employee类的构造器，构造器总是伴随着new操作符的执行被调用，不能对一个已经存在的对象调用构造器，来达到重新设置实例域的目的
        name = n;                  // 不要在构造器中定义与实例域重名的局部变量
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {    // 只返回实例域值，又称为域访问器
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {    // 方法用于操作对象以及存取它们的实例域
        double raise = salary * byPercent / 100;     // byPercent为显示参数，隐式参数为方法名前的Employee对象，用关键字this表示
        salary += raise;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];   // 构造一个Employee数组，并填入三个雇员对象

        staff[0] = new Employee("Carl Cracker",75000, 1987,12, 15);
        staff[1] = new Employee("Harry Hacker",50000, 1889,10, 1);
        staff[2] = new Employee("Tony Tester",40000, 1990,3, 15);

        for (Employee e : staff) {      // 调用Employee类的raiseSalary()方法，将每个雇员的薪水提高 5%
            e.raiseSalary(5);
        }

        for (Employee e : staff) {     // 调用Employee类的getName()方法、getSalary()方法、getHireDay()方法
            System.out.println("name : " + e.getName()
                    + ", salary : " + e.getSalary()
                    + ", hireDay : " + e.getHireDay());
        }
    }
}
