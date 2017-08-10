package com.lilei1998.oop;

import java.text.NumberFormat;

/**
 * Created by lilei on 2017/8/10 下午3:29.
 */

public class FactoryTest {
    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));
    }
}
