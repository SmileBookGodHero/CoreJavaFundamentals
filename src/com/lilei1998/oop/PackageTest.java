package com.lilei1998.oop;

import static java.lang.System.out;

/**
 * Created by lilei on 2017/8/21 下午4:48.
 * Employee 类 在 com.lilei1998.oop 包中，因此不需要导入
 * 由于导入 static java.lang.System.out 语句，所以输出不需要 System.out 语句
 */
public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10,1);

        harry.raiseSalary(5);

        out.println("name = " + harry.getName() + " , salary = " + harry.getSalary());
    }
}
