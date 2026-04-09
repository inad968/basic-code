package com.itheima.myset;

import java.util.TreeSet;

public class A05_TreeSetDemo1 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        //TreeSet底层数据结构是红黑树，所以打印集合，是从小到大有序的
        ts.add(5);
        ts.add(1);
        ts.add(4);
        ts.add(3);
        ts.add(2);

        System.out.println(ts);
    }
}
