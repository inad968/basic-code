package com.itheima.a04regexdemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        //"\"表示转义字符，改变后面那个字符原本的含义，而且只转义一位
        System.out.println("\"");

        System.out.println("---------------" + "." + "表示任意一个字符，都可以---------------");
        System.out.println("你".matches(".."));//false，因为一个点只能表示一个字符
        System.out.println("你a".matches(".."));//true

        System.out.println("---------------" + "\\d" + "表示任意一个数字---------------");
        System.out.println("a".matches("\\d"));//两个\\代表一个\
        System.out.println("6".matches("\\d"));
        System.out.println("666".matches("\\d\\d\\d"));

        System.out.println("---------------" + "\\w" + "表示[a-zA-Z_0-9]单词字符---------------");
        System.out.println("_".matches("\\w"));

        System.out.println("---------------以下可以校验多个字符---------------");
        System.out.println("2442fsfs".matches("\\w{6,}"));//表示{}前面这个字符至少出现六次
        System.out.println("2442fsfs".matches("\\w{6}"));//表示{}前面这个字符出现六次

    }
}
