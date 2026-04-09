package com.itheima.test1;

public class Student {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 20 && age <= 25) {
            this.age = age;

        } else {
            System.out.println("年龄不符合要求");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
       this.gender = gender;
    }

    public void study() {
        System.out.println("Studying");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

}
