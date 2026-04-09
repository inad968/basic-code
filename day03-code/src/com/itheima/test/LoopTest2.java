package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请猜一个1-100之间的数字：");
            int guess = sc.nextInt();
            if(guess > num){
                System.out.println("猜大了");
            }else if (guess < num){
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
            }
        }
    }
}
