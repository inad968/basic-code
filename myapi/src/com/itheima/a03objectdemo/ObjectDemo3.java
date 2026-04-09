package com.itheima.a03objectdemo;

public class ObjectDemo3 {
    public static void main(String[] args) {

       String s = "abc";
       StringBuilder sb = new StringBuilder("abc");

        //有个注意事项：
        //调用方法时，要关注方法前面的调用者,即调用对象是谁
        //s.   sb.
        //字符串的equals()方法是重写过的，它先判断传进来的对象是不是字符串
        //如果是，进而比较字符串的内容
        //如果不是，则直接返回false；
        System.out.println(s.equals(sb));
        // StringBuilder 中没有重写equals()方法，而是继承object类的equals()方法
        //bject类的equals()方法，是用==号去比较两个对象的地址值。所以比较的是两个对象的地址值。
        System.out.println(sb.equals(s));
    }
}
