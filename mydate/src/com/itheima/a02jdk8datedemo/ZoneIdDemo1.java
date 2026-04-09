package com.itheima.a02jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneId1 = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId1);

    }
}
