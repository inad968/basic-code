package com.itheima.stringdemo;

public class StringDemo5 {
    public static void main(String[] args) {
        reverse("abc");
    }

    public static String reverse(String str) {
//        charAt方法，遍历字符串
        for (int i = str.length() - 1; i >= 0; i--) {
//            倒着遍历
            char c = str.charAt(i);
            System.out.println(c);
        }
        return "";
    }
}
