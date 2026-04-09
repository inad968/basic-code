package com.itheima.integerdemo;

import java.util.Scanner;

public class IntegerDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入内容：");

        //在以后的开发中。我们统一使用nextLine()去接收
        //它会返回一个字符串，再用相应的parse去转换
        String s = sc.nextLine();
        System.out.println(s);

        double d = Double.parseDouble(s);
        System.out.println(d);
    }
}
