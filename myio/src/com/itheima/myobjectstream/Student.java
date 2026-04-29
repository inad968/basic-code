package com.itheima.myobjectstream;

import java.io.Serializable;

public class Student implements Serializable {
    /*如果一个类实现了Serializable接口，则表示这个类的对象可被序列化
    Java底层会根据该类的变量和方法进行计算，得到一个序列号，即版本号
    当我们修改该类的内容时，序列号会发生变化，所以我们可以选择固定序列号
    如果以后我们需要把一个JavaBean的对象序列化到本地文件当中，需要做两步，第一步是实现Serializable接口，第二步是固定序列号*/
    private static final long serialVersionUID = -5890135746201264030L;

    private String name;
    private int age;
    /*transient:瞬态关键字，该关键字标记的成员变量不参与序列化过程
    利用该关键字可以实现对属性进行保密*/
    private transient String address;


    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
