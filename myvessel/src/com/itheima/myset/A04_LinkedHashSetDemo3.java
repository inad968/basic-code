package com.itheima.myset;

import java.util.LinkedHashSet;

public class A04_LinkedHashSetDemo3 {
    public static void main(String[] args) {

        Student s1 = new Student("张三",24);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("张三",24);
        /*LinkedHashSet是HashSet的子类，都是泛型类
        LinkedHashSet底层多了一个双链表的机制，即每个元素还要记录上一个元素的地址和下一个元素的地址
        所以遍历该集合的时候，就不是从数组的0索引开始遍历链表
        而是遍历双链表，从添加的头节点开始，所以LinkedHashSet它是有序的，即存和取的顺序是一样的*/
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        System.out.println(lhs);
    }
}
