package com.itheima.a04regexdemo;

public class RegexDemo12 {
    public static void main(String[] args) {

        //非捕获分组：(?:)(?=)(?!)不占用组号，不能使用"\\1"
        String regex1 = "[1-9]\\d{16}(?:x|X|\\d)";
        String regex2 = "[1-9]\\d{16}(?:x|X|\\d)\\1";
        String regex3 = "[1-9]\\d{16}(x|X|\\d)\\1";

        System.out.println("12332120001213020x".matches(regex1));
    }
}
