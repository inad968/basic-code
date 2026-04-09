package com.itheima.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = sc.nextInt();
        boolean flag = true;//假设num是质数
        for(int i = 2; i <num; i++){
            if (num % i == 0) {
                flag = false;//num不是质数
//                System.out.println(num + "不是质数");
                break;
            }
            }
        if(flag){
            System.out.println(num + "是质数");
        }else {
            System.out.println(num + "不是质数");
        }
        }
    }

