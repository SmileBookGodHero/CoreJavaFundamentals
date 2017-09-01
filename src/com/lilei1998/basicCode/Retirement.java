package com.lilei1998.basicCode;

import java.util.Scanner;

/**
 * Created by lilei on 2017/9/1 上午10:50.
 */
public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How much money do you need to retire? ");
        double goal = in.nextDouble();
        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + " years.");
    }
}
