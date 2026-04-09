package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("烟位", "慕蝶");
        map.put("二突", "火男");
        map.put("一突", "捷风");
        //第二种遍历方式：获取键值对对象这个整体entry到set集合中
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        System.out.println("--------------------");
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("--------------------");
        entries.forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
    }
}
