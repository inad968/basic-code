package com.itheima.a01myexception;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        //1.可以直接打印sout("数据出错") 2.可以throw 一个异常，
        // 作为方法内部的一种特殊返回值，返回给调用处，告诉调用处底层执行情况
        s1.setAge(50);
    }
}
