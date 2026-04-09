package com.itheima.listdemo;

import java.util.ArrayList;
     //ArrayList是一个类
        //  创建集合对象
        //  完成对集合的增删改查

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        增
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
//        删
     /*   boolean result = list.remove("aaa");
        String str = list.remove(1);*/
//        改
        String result1 = list.set(0, "eee");
        System.out.println(result1);
     /*   System.out.println(str);
        System.out.println(result);*/
        System.out.println(list);
        String result2 = list.get(1);
        System.out.println(result2);
//        遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
