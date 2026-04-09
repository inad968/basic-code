package com.itheima.a04regexdemo;

public class RegexDemo9 {
    public static void main(String[] args) {
        //字符串的三个方法：matches(),replaceAll(),split()
        String s = "林丹qwersf12345李宗纬hjksla203698安塞龙";

        String result = s.replaceAll("[\\w&&[^_]]+", "vs");

        System.out.println(s);
        System.out.println(result);
        System.out.println();

        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
