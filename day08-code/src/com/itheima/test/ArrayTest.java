package com.itheima.test;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("知侍郎", 23);
        Student s2 = new Student("刀马", 24);
        Student s3 = new Student("小七", 7);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() +" "+ s.getAge());
        }
    }

}
