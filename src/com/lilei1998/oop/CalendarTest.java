package com.lilei1998.oop;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by lilei on 2017/8/10 上午10:22.
 * 打印当月日历表
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);   //  设置为这个月的第一天
        DayOfWeek weekday = date.getDayOfWeek();   // 获取这一天为星期几
        int value = weekday.getValue();       // 获取星期几的数值， 1 = Monday , ... , 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");    // 打印日历表头
        for (int i = 1; i < value; i++) {            // 当月第一天的星期几缩进
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {     // 循环条件
            System.out.printf("%3d", date.getDayOfMonth());   // 打印输出日期，占3个字符
            if (date.getDayOfMonth() == today) {    // 判断日期是否为当天，如果是，则打印出*，如果不是则打印空格
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            date = date.plusDays(1);          // 日期增加一天
            if (date.getDayOfWeek().getValue() == 1) {    // 如果增加一天后是星期一，则换行
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {    //  循环之外，如果月底的日期，不是星期一，则换行
            System.out.println();
        }
    }
}
