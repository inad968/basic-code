package com.itheima.myprintstream;

import java.io.PrintStream;

public class PrintStreamDemo3 {
    public static void main(String[] args) {
        /*System是一个最终类，不能被修改
        out是该类里面的一个静态变量
        System.out返回一个打印流的对象，指向控制台
        所以该输出语句就是一个打印流，在虚拟机启动的时候，由虚拟机创建*/

        PrintStream ps = System.out;
        ps.println("你好你好");

        System.out.println("很高兴见到你");
    }
}
