package com.itheima.myset;

import java.util.HashSet;

public class A03_HashSetDemo2 {
    public static void main(String[] args) {

        Student s1 = new Student("张三",24);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("张三",24);

        HashSet<Student> hs = new HashSet<>();

        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);
    }
}
