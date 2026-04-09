package com.itheima.a04regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo8 {
    public static void main(String[] args) {

        String str = "java 自从 95 年问世以来，经历了很多版本，目前企业中用的最多的是 Java8 和 JAva11," +
                "因为这两个是长期支持版本，下一个长期支持版本是 JAVa17，相信在未来不久 JAVA17 也会逐渐登上历史舞台";

        String regex1 = "((?i)java)(?=8|11|17)";
        String regex2 = "((?i)java)(8|11|17)";
        String regex3 = "((?i)java)(?:8|11|17)";
        String regex4 = "((?i)java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex3);

        Matcher m = p.matcher(str);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
