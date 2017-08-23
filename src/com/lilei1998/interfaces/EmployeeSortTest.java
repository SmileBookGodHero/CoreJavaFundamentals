package com.lilei1998.interfaces;

import java.util.Arrays;

/**
 * Created by lilei on 2017/8/23 下午3:16.
 * Comparable 接口的使用
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        for (Employee employee : staff) {
            System.out.println("name = " + employee.getName() + ", salary = " + employee.getSalary());
        }
    }
}
