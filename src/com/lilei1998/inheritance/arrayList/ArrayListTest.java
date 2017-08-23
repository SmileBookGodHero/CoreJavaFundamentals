package com.lilei1998.inheritance.arrayList;

import com.lilei1998.inheritance.abstractClasses.Employee;

import java.util.ArrayList;

/**
 * Created by lilei on 2017/8/23 上午9:50.
 * ArrayList 类
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

        for (Employee employee : staff) {
            employee.raiseSalary(5);
        }

        for (Employee employee : staff) {
            System.out.println("name = " + employee.getName() + ", salary = " + employee.getSalary() + ", hireDay = " + employee.getHireDay());
        }
    }
}
