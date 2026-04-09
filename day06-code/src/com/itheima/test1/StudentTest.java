package com.itheima.test1;

public class StudentTest {
    public static void main(String[] args) {
//        测试类
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(25);
        student1.setGender("男");
        String name = student1.getName();
        int age = student1.getAge();
        String gender = student1.getGender();
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        /*student1.age = 20;
        student1.gender = "男";
        System.out.println("姓名：" + student1.name);
        System.out.println("年龄：" + student1.age);
        System.out.println("性别：" + student1.gender);*/
        student1.study();
        student1.sleep();
    }
}
