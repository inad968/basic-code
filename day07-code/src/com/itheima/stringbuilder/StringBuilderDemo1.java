package com.itheima.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
//        创建容器，添加元素，反转，变回字符串
        String result = new StringBuilder().append(str).reverse().toString();
        if(str.equals(result)){
            System.out.println("该字符串是对称的");
        }else {
            System.out.println("该字符串非对称");
        }
    }
}
