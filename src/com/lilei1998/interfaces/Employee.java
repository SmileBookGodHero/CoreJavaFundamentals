package com.lilei1998.interfaces;

/**
 * Created by lilei on 2017/8/23 下午3:16.
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent /100;
        salary += raise;
    }

    /**
     * 通过 salary 比较 employees
     * @param other employee 对象
     * @return 当前对象 salary 高，返回正数；相等返回0；低则返回负数
     */

    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
