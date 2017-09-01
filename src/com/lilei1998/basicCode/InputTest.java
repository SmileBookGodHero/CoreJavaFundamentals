package com.lilei1998.basicCode;

import java.util.Scanner;

/**
 * Created by lilei on 2017/9/1 上午10:08.
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = in.nextLine();

        System.out.print("How old are you? ");
        int age = in.nextInt();

        System.out.println("Hello, " + name + ". Next year you'll be " + (age + 1));

//        Console console = System.console();
//        String userName = console.readLine("User name: ");
//        char[] password = console.readPassword("Password: ");
//        System.out.println("User name: " + userName + " Password: " + password);
    }
}
