package com.itheima.a04regexdemo;

public class RegexDemo11 {
    public static void main(String[] args) {

        String str = "我要学学学编编编编程程程程程";

        //  "\\1"表示在正则表达式内部使用和第一组相同的内容
        //  "$1"表示在正则表达式外部使用和第一组相同的内容
        //都表示后续还要继续使用第一组的数据
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }
}
