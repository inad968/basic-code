package com.itheima.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
//        substring方法的使用，截取
        String number = "19980828110";
        String start = number.substring(0, 3);
        String end = number.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
