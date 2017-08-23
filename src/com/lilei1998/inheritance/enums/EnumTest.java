package com.lilei1998.inheritance.enums;

import java.util.Scanner;

/**
 * Created by lilei on 2017/8/23 下午2:22.
 * 枚举类的使用
 */

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviaton;

    public String getAbbreviaton() {
        return abbreviaton;
    }

    private Size(String abbreviation) {
        this.abbreviaton = abbreviation;
    }
}
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        System.out.println();
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size = " + size);
        System.out.println("abbreviation = " + size.getAbbreviaton());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job -- you paid attention to the _.");
        }
    }
}
