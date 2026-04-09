package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo1 {
    public static void main(String[] args) {
        //获取标准时间
        Instant now = Instant.now();
        System.out.println(now);
        //获取指定时间
        Instant instant = Instant.ofEpochMilli(0L);
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochSecond(1L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant2);
        //获取某时区的时间
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
        //比较时间的大小，不必再解析成date，再getDate。直接用isBefore()方法判断
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);
        boolean result = instant3.isBefore(instant4);
        System.out.println(result);
    }
}
