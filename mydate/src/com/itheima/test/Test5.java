package com.itheima.test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //判断一个年份是否是闰年
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        c.set(2000,Calendar.MARCH,1);
        System.out.println(c);

        c.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);

        //第二种方法
        LocalDate date1 = LocalDate.of(2000, 3, 1);
        LocalDate date2 = date1.minusDays(1);
        int day2 = date2.getDayOfMonth();
        System.out.println(day2);

        //第三种方法
        boolean result = date1.isLeapYear();
        System.out.println(result);
    }
}
