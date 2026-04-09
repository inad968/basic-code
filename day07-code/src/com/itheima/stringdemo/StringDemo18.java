package com.itheima.stringdemo;

public class StringDemo18 {
    public static void main(String[] args) {
        String str = "Hello   world congrats";
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(c != ' '){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}
