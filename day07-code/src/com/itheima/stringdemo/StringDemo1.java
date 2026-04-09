package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String rightUsername = "admin";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String passWord = sc.next();
            if (userName.equals(rightUsername) && passWord.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if(i == 2){
                    System.out.println("账号已被冻结，请联系客服");
                }else {
                    System.out.println("用户名或密码有误，您还剩"+(2-i)+"次机会");
                }
            }
        }
    }
}
