package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数表示范围的开始：");
        int start = sc.nextInt();
        System.out.print("请输入一个整数表示范围的结束：");
        int end = sc.nextInt();
        int count = 0;
        for(int i = start; i <= end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println("范围内既能被3整除又能被5整除的整数个数为：" + count);
    }
}
