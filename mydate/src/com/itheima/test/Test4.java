package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {

        //利用JDK7的方式计算时间间隔
        String birthStr = "2000年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthDate = sdf.parse(birthStr);
        long birthDateTime = birthDate.getTime();

        long todayTime = System.currentTimeMillis();
        long time = todayTime - birthDateTime;
        System.out.println(time / 1000 / 60 / 60 / 24);

        //利用JDK8的方式计算时间间隔
        LocalDate birth = LocalDate.of(2000, 1, 1);
        LocalDate now = LocalDate.now();

        long between = ChronoUnit.DAYS.between(birth, now);
        System.out.println(between);
    }
}
