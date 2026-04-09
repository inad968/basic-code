package com.itheima.stringdemo;

import java.util.Random;
import java.util.Scanner;

public class StringDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        while (true) {
            System.out.println("请输入一个字符串：");
            string = sc.next();
            boolean flag = check(string);
            if (flag) {
                break;
            } else {
                System.out.println("输入的字符串长度不符合要求");
            }
        }
        String newString = toNewString(string);
        System.out.println(newString);

    }

    //        校验字符串长度
    public static boolean check(String str) {
        if (str.length() > 5) {
            return true;
        } else {
            return false;
        }
    }

    //    打乱字符串的顺序
    public static String toNewString(String s) {
        char[] arr = s.toCharArray();  //  [a,b,c,d,e]
        Random r = new Random();
        int index = r.nextInt(arr.length); //  生成随机索引
        char temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String result = new String(arr);
        return result;
    }
}
