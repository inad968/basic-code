package com.itheima.a02mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A01_TreeMapDemo1 {
    public static void main(String[] args) {
        //这里的排序是对键进行排序
        //对于integer，double，String等Java在底层已经默认定义好了排序规则
        //如果想重新定义排序规则，则需要实现接口，重写方法，自定义规则
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tm.put(1,"奥利奥");
        tm.put(2,"脉动");
        tm.put(3,"雪碧");
        tm.put(4,"牛奶");
        tm.put(5,"奶茶");

        System.out.println(tm);
    }
}
