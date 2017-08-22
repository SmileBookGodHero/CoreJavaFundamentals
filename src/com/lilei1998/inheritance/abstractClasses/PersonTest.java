package com.lilei1998.inheritance.abstractClasses;

/**
 * Created by lilei on 2017/8/22 上午10:19.
 * 抽象类的使用
 */
public class PersonTest {
    public static void main(String[] args) {

        Person[] people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1989, 10,1);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getDescription());
        }
    }
}


