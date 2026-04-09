package com.itheima.a04regexdemo;

public class RegexDemo5 {
    public static void main(String[] args) {

        String regex1 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("12332120001212208x".matches(regex1));

        System.out.println("----------------------------------");
        String regex2 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|(?i)x)";
        String regex3 = "[1-9]\\d{5}(1[89]|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|(?i)x)";
        System.out.println("123321199802032120".matches(regex2));
        System.out.println("12332119980203212X".matches(regex3));

        System.out.println("----------------------------------");
        String regex4 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        System.out.println("12332119980203212X".matches(regex4));
        System.out.println("说明：[18]括起来只表示判断一位，是1或者8；不括起来18，表示判断两位，第一位只能是1，第二位只能是2");

    }
}
