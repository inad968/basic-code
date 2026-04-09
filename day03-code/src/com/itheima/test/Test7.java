package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i * i == num){
                System.out.println(i + "是" + num + "的平方根");
                break;
            }else if(i * i > num){
                System.out.println(i - 1 + "是" + num + "的平方根的整数部分");
                break;
            }
        }
    }
}
