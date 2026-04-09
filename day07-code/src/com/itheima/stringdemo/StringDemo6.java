package com.itheima.stringdemo;

public class StringDemo6 {
    public static void main(String[] args) {
        String result = reverse("abc");
        System.out.println(result);
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
//            两个length不一样，一个是属性，一个是方法
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}


