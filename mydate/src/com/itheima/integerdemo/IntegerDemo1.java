package com.itheima.integerdemo;

public class IntegerDemo1 {
    public static void main(String[] args) {
        //把整数转成二进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);
        //把整数转成八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);
        //把整数转成十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);

        //将字符串类型的整数转成int类型的整数
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i + 1);

        //把字符串类型的true转换成Boolean类型的true
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }
}
