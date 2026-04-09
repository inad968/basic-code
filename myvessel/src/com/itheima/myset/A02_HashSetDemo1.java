package com.itheima.myset;

public class A02_HashSetDemo1 {
    public static void main(String[] args) {
        
        Student s1 = new Student("张三",25);
        Student s2 = new Student("张三",25);
        
        /*此时没有重写hashcode()方法，计算时用的是地址值
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());*/

        //重写hashcode()方法，计算时用的是属性值，此时结果是一样的，但可能发生哈希碰撞
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
