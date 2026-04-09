package com.itheima.a04regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {

        String str = "Java 自从 95 年问世以来，经历了很多版本，目前企业中用的最多的是 Java8 和 Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是 Java17，相信在未来不久 Java17 也会逐渐登上历史舞台";

        method1(str);
    }

    private static void method1(String str) {
        Pattern p = Pattern.compile("Java\\d{0,2}");

        Matcher m = p.matcher(str);
        //在while方法体在调用m.find()方法，直到false
        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }

}
