package com.lilei1998.exception.stackTrace;

import java.util.Scanner;

/**
 * Created by lilei on 2017/8/24 上午10:07.
 */
public class StackTraceTest {
    public static int factorial (int n) {
        System.out.println("factorial(" + n + ")");
        Throwable throwable = new Throwable();
        StackTraceElement[] frames = throwable.getStackTrace();
        for (StackTraceElement f : frames) {
            System.out.println(f);
        }
        int r;
        if (n <= 1) {
            r = 1;
        } else {
            r = n * factorial(n - 1);
        }
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        factorial(n);
    }
}
