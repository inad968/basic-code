package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapDemo2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("辛拉面", 5);
        map.put("冬阴功拉面", 3);
        map.put("板面", 6);
        map.put("牛肉面", 5);

        //遍历map，第一种方式：先获取键，存放到单列集合中
        //再通过键获取对应的值
        Set<String> keys = map.keySet();

        for (String key : keys) {
            //通过key获取对应的value值
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("----------------------");

        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("----------------------");

        keys.forEach(key -> System.out.println(key + " = " + map.get(key)));
        System.out.println("----------------------");

        keys.forEach(new Consumer<String>() {
            @Override
            //这里的传进来的参数key是lambda在底层使用增强for遍历得到的
            //accept的意思是接收传进来的每一个键
            public void accept(String key) {
                System.out.println(key + " = " + map.get(key));
            }
        });
    }
}
