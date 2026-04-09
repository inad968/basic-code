package com.itheima.a02jdk8datedemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime birthDay = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
        System.out.println(birthDay);
        System.out.println("相差的年份数：" + ChronoUnit.YEARS.between(birthDay, now));
        System.out.println("相差的月份数：" + ChronoUnit.MONTHS.between(birthDay, now));
        System.out.println("相差的星期数：" + ChronoUnit.WEEKS.between(birthDay, now));
        System.out.println("相差的天数：" + ChronoUnit.DAYS.between(birthDay, now));
        System.out.println("相差的小时数：" + ChronoUnit.HOURS.between(birthDay, now));
    }
}
