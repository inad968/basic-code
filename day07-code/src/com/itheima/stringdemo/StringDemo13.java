package com.itheima.stringdemo;

public class StringDemo13 {
//    修改字符串的内容：tochararray/substring方法
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "cdeab";
        boolean result = check(str1, str2);
        System.out.println(result);
    }

    //旋转
    public static String rotate(String str) {
//     截取+拼接
        char start = str.charAt(0);
        String end = str.substring(1);
        return end + start;
    }

    //旋转一次就判断一次。
    public static boolean check(String str1,String str2) {
        for (int i = 0; i < str1.length(); i++) {
            str1 = rotate(str1);
            if(str1.equals(str2)){
                return true;
            }
        }
        return false;
    }
}
