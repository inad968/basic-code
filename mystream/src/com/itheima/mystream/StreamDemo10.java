package com.itheima.mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "张三丰-男-100", "赵敏-女-16", "小师妹-女-14", "灭绝师太-女-99", "金毛狮王-男-100");

        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newList);

        System.out.println();

        Set<String> newSet = list.stream()
                .filter(s -> "女".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newSet);

        System.out.println();

        Map<String, Integer> newMap1 = list.stream().collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[2]);
            }
        }));
        System.out.println(newMap1);

        System.out.println();

        Map<String, Integer> newMap2 = list.stream().
                collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));

        System.out.println(newMap2);
    }
}
