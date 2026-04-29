package com.itheima.mytest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) throws IOException {

        Student s1 = new Student("zhangsan",23,"北京");
        Student s2 = new Student("lisi",24,"重庆");
        Student s3 = new Student("wangwu",25,"天津");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\g.txt"));
        oos.writeObject(list);

        oos.close();
    }
}
