package com.itheima.a02mytreemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A02_TreeMapDemo2 {
    public static void main(String[] args) {
        //这里的排序是对键进行排序
        TreeMap<Student,String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhaoliu",26);

        tm.put(s1,"江苏");
        tm.put(s2,"北京");
        tm.put(s3,"天津");
        tm.put(s4,"深圳");

        Set<Map.Entry<Student, String>> entries = tm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry);
        }
    }
}
