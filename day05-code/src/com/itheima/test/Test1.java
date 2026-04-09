package com.itheima.test;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*生成验证码*/
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <= 25){
                chs[i] = (char)(97 + i);
            }else {
                chs[i] = (char)(65 + i - 26);
            }
        }
    String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
//        System.out.println(result);
        int num = r.nextInt(10);
        result = result + num;
        System.out.println(result);
    }
}
