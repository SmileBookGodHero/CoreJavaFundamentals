package com.lilei1998.oop;

import java.time.LocalDate;

/**
 * Created by lilei on 2017/8/10 上午11:12.
 */

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
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
