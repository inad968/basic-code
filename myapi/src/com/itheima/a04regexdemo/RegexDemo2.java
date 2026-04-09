package com.itheima.a04regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {

        System.out.println("---------------1---------------");
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        System.out.println("ab".matches("[abc][abc]"));

        System.out.println("---------------2---------------");
        System.out.println("a".matches("[^abc]"));//不能出现abc
        System.out.println("zz".matches("[^abc][^abc]"));

        System.out.println("---------------3---------------");
        System.out.println("a".matches("[a-zA-Z]"));//属于a-z或者A-Z
        System.out.println("zz".matches("[a-zA-Z][a-zA-Z]"));
        System.out.println("0".matches("[a-zA-Z0-9]"));//三次判断

        System.out.println("---------------4---------------");
        System.out.println("a".matches("[a-d[m-p]]"));//提高代码阅读性，也表示或的意思

        System.out.println("---------------5---------------");
        System.out.println("a".matches("[a-z&&[def]]"));//&&表示取交集
        System.out.println("d".matches("a-z&&[def]"));

        System.out.println("---------------6---------------");
        System.out.println("a".matches("[a-z&&[^bc]]"));
        System.out.println("z".matches("[ad-z]"));//表示属于a或者d-z

        System.out.println("---------------7---------------");
        System.out.println("a".matches("[a-z&&[^m-p]]"));
        System.out.println("a".matches("[a-lq-z]"));//表示属于a-l或者q-z
    }
}
