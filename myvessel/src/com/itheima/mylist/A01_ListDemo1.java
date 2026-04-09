package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        list.add(1,"QQQ");
        System.out.println(list);

        String result = list.remove(3);
        System.out.println(result);
        System.out.println(list);

        String s = list.set(3, "CCC");
        System.out.println(s);
        System.out.println(list);

        String s1 = list.get(0);
        System.out.println(s1);
    }
}
