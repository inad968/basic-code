package com.itheima.myset;

import java.util.TreeSet;

public class A08_TreeSetDemo4 {
    public static void main(String[] args) {

        Student2 s1 = new Student2("zhangsan",23,90,99,50);
        Student2 s2 = new Student2("lisi",24,90,98,50);
        Student2 s3 = new Student2("wangwu",25,95,100,30);
        Student2 s4 = new Student2("zhaoliu",26,60,99,70);
        Student2 s5 = new Student2("qianqi",27,70,80,70);

        /*默认情况下，我们使用ArrayList集合
        如果有去重的要求，我们可以使用HashSet集合，
        如果还要求要排序，有排序的规则，那么我们需要使用TreeSet*/
        TreeSet<Student2> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student2 t : ts) {
            System.out.println(t);
        }
    }
}
