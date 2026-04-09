package com.itheima.a03objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {

        Student stu1 = new Student("张三",25);
        Student stu2 = new Student("张三",25);

        //equals()方法比较的是两个对象的地址值
        //重写之后的equals()方法比较的是两个对象的属性，看它们的属性是否相等
        boolean result = stu1.equals(stu2);
        System.out.println(result);
    }
}
