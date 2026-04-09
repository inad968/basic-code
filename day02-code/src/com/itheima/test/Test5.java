package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        int height1 = 180;
        int height2 = 190;
             int height3 = 185;
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println("三个人中最高的身高是：" + max);
    }
}
