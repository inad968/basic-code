package com.itheima.stringdemo;

import java.util.Random;

public class StringDemo16 {
    public static void main(String[] args) {
        char[] arr = new char[52];
//        玩转索引，利用ASCII码表给数组赋值
        for (int i = 0; i < arr.length; i++) {
            if(i <= 25){
                arr[i] = (char)(97 + i);
            }else {
                arr[i] =(char)(65 + i -26);
            }
        }
        System.out.println(arr);
        Random r = new Random();
        String result = "";
//        从数组中随机获取四次，拼接成字符串
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(arr.length);
            result = result + arr[randomIndex];
        }
        System.out.println(result);
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);
//        修改字符串的内容
        char[] arr1 = result.toCharArray();
        char temp;
        for (int i = 0; i < arr1.length; i++) {
            int index = r.nextInt(4);
            temp = arr1[arr1.length - 1];
            arr1[arr1.length - 1] = arr1[index];
            arr1[index] = temp;
        }
//        new一个新的字符串
        String newResult = new String(arr1);
        System.out.println(newResult);
    }
}
