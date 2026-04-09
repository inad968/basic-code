package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串：");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入的字符串不符合规则");
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
//            遍历字符串，得到字符，再转换成数字，再转换成罗马字符，再拼接，再转换成新的字符串
            char c = str.charAt(i);
            String s = changeLuoMa(c);
            sb.append(s);
        }
        String string = sb.toString();
        System.out.println(string);
    }

    public static boolean checkStr(String str) {
//        第一个要求：
        if (str.length() > 9) {
            return false;
        }
//        第二个要求：
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String changeLuoMa(char number) {
        String str;
        switch (number){
            case '0' -> str = "";
            case '1' -> str = "Ⅰ";
            case '2' -> str = "Ⅱ";
            case '3' -> str = "Ⅲ";
            case '4' -> str = "Ⅳ";
            case '5' -> str = "Ⅴ";
            case '6' -> str = "Ⅵ";
            case '7' -> str = "Ⅶ";
            case '8' -> str = "Ⅷ";
            case '9' -> str = "Ⅸ";
            default -> str = "";
        }
        return str;
    }
}
