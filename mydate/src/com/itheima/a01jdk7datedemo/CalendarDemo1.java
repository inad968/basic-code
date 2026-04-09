package com.itheima.a01jdk7datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //返回calendar的实例对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //修改日历默认的时间
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);

        //用set()方法修改日历
        c.set(Calendar.YEAR,2023);
        c.set(Calendar.MONTH,8);
        c.set(Calendar.DAY_OF_MONTH,10);

        //用add()方法，增加或减少
        c.add(Calendar.MONTH,1);

        int year = c.get(Calendar.YEAR);
        int moth = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(year+", "+moth+", "+date+", "+getWeek(week));
    }

    private static String getWeek(int index) {
        //利用查表法的思想：将数字与星期相对应
        //因为week是整数，所以把它看成索引，去数组中查找
        String[] arr = {"", "星期天", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return arr[index];
    }
}
