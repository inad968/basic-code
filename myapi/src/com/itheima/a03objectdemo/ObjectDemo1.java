package com.itheima.a03objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {

        //toString()返回对象的字符串表现形式，即地址值
        //重写之后的toString()返回的是对象的属性值
        Student stu = new Student("张安",23);
        String str = stu.toString();
        System.out.println(str);

        //如果不调用toString()方法，直接打印对象本身
        //得到的也是对象的字符串表现形式，即地址值
        //这是由于sout的底层逻辑为：当要打印的内容是一个对象时
        //它会调用toString()方法，所以最后还是关注是否重写了toString()方法
        System.out.println(stu);
    }
}
