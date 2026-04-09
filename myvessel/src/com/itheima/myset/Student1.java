package com.itheima.myset;

public class Student1 implements Comparable<Student1> {
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student1{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student1 o) {
        System.out.println("----------------");
        //this表示当前要添加的元素，o表示已经存放于红黑树中的元素
        System.out.println("this:" + this);
        System.out.println("o" + o);
        //return的值，正数表示，要添加的元素是大的，存右边
        return this.getAge() - o.getAge();
    }
}
