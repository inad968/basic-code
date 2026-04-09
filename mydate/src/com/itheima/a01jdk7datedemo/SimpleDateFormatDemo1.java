package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {

        method1();
        System.out.println();
        method2();
    }

    private static void method2() throws ParseException {
        //把字符串格式的时间解析成date形式
        //因为字符串和对象等引用数据类型不能直接比大小
        //所以解析成date，然后用getTime()方法去比较
        String str = "2026-11-11 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
        System.out.println(date.getTime());
    }

    private static void method1() {
        //Thu Jan 01 08:00:00 CST 1970,如果不想要这种格式，就可以使用下面的方法
        //把d格式化成你想要的阅读习惯，即改成字符串
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(d1);
        System.out.println(str1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2 = sdf2.format(d1);
        System.out.println(str2);
    }
}
