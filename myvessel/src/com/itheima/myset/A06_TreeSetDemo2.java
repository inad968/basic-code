package com.itheima.myset;

import java.util.TreeSet;

public class A06_TreeSetDemo2 {
    public static void main(String[] args) {

        Student1 s1 = new Student1("zhangsan",23);
        Student1 s2 = new Student1("lisi",24);
        Student1 s3 = new Student1("wangwu",25);
        Student1 s4 = new Student1("zhaoliu",26);
        //在存储自定义对象时，需要让JavaBean类去实现comparable接口
        //重写compareTo方法，实现自然排序
        TreeSet<Student1> ts = new TreeSet<>();

        ts.add(s3);
        ts.add(s2);
        ts.add(s1);
        ts.add(s4);

        System.out.println(ts);
    }
}
