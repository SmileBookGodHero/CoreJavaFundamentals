package com.lilei1998.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by lilei on 2017/8/23 下午5:56.
 * lambda 表达式的使用
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));

        System.out.println("Sort in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("Sort by length: ");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer timer = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
