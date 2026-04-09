package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        int money;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
//        校验：判断金额是否有效
        while (true) {
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }
        System.out.println(money);
//        将1234的每一位取出，将个位传入定义的方法中

        String moneyStr = "";
        while (true) {
            int ge = money % 10;
//            调用方法
            String capitalNumber = getCapitalNumber(ge);
//            字符串的拼接
            moneyStr = capitalNumber + moneyStr;
            money = money / 10;
            if (money == 0) {
                break;
            }
        }
        System.out.println(moneyStr);
//        3.将金额补齐七位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);
//        4.插入单位：先拼接数字，在拼接单位，就达到了插入单位的效果
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元" };
//        可以向如下所示进行打印，也可以拼接
        /*for (int i = 0; i < moneyStr.length(); i++) {
//          遍历字符串
            char c = moneyStr.charAt(i);
            System.out.print(c);
            遍历数组
            System.out.print(arr[i]);
        }*/
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }

    public static String getCapitalNumber(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌" };
        return arr[num];
    }
}
