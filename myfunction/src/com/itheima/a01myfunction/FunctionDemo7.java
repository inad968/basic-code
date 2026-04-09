package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDemo7 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));
        list.add(new Student("赵六",26));

        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
