package com.itheima.a04regexdemo;

public class RegexDemo4 {
    public static void main(String[] args) {
        //19980828110    15982686182     15982637972
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("19980828110".matches(regex1));
        System.out.println("15982686182".matches(regex1));
        System.out.println("15982637972".matches(regex1));

        System.out.println("-------------------------------");
        //座机号:
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2325266".matches(regex2));

        System.out.println("-------------------------------");
        //邮箱:
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("dlei0009@pci.com.cn".matches(regex3));

        System.out.println("-------------------------------");
        //使用插件any-rule
        //23:12:20     02:23:50     12:25:26
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        String regex5 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:12:20".matches(regex4));
        System.out.println("23:20:20".matches(regex5));
        System.out.println("说明：()表示分组的意思，|表示或者的意思");
    }
}
