package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            System.out.println("请输入您的姓名：");
            String name = sc.next();
            System.out.println("请输入您的年龄：");
            int age = sc.nextInt();
            stu.setName(name);
            stu.setAge(age);
            list.add(stu);
        }
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
