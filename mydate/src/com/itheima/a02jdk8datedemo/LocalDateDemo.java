package com.itheima.a02jdk8datedemo;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateDemo {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        System.out.println("今天是：" + nowDate);

        LocalDate date = LocalDate.of(2026, 3, 12);
        System.out.println("指定的时间：" + date);
        //获取年
        int year = date.getYear();
        System.out.println(year);
        //获取月
        Month month = date.getMonth();
        System.out.println(month);//英文表示的月份
        System.out.println(month.getValue());//阿拉伯数字表示的月份
        //with可以对时间进行修改
        LocalDate withLocalDate = date.withYear(2027);
        System.out.println(withLocalDate);

        //各大App给你发生日祝福，假如下面是你的生日
        LocalDate date1 = LocalDate.of(2000, 3, 12);
        //当前时间是：
        LocalDate now = LocalDate.now();
        //我们只需要比较月、日
        MonthDay birthDay = MonthDay.of(date1.getMonthValue(), date1.getDayOfMonth());
        MonthDay nowTime = MonthDay.from(now);
        System.out.println(birthDay.equals(nowTime));

    }
}
