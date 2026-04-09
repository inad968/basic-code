package com.itheima.a04regexdemo;

public class RegexDemo10 {
    public static void main(String[] args) {

        //()小括号括起来分为一组，左边的第一个为第一组：(()),即里面的为第二组
        //  a123a    b123b   1abc1
        String regex1 = "(.).+\\1";

        System.out.println("a123a".matches(regex1));
        System.out.println("b123b".matches(regex1));
        System.out.println("1abc1".matches(regex1));
        System.out.println("1abc2".matches(regex1));

        //  abc123abc   123789123
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("123789122".matches(regex2));

        //  aaa123aaa    111abc111   223abc222
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("111abc111".matches(regex3));
        System.out.println("223abc222".matches(regex3));
    }
}
