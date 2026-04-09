package com.itheima.stringdemo;

public class StringDemo14 {
    //    修改字符串的内容：tochararray/substring方法
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "cdeab";
        boolean result = check(str1, str2);
        System.out.println(result);
    }

    //旋转
//    把第一位拿出来，把后面的字符依次前移，再把第一位加到最后
    public static String rotate(String str) {
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        String result = new String(arr);
        return result;
    }

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
