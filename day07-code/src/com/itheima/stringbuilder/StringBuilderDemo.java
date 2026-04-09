package com.itheima.stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
//        创建对象
        StringBuilder sb = new StringBuilder();
//        添加字符串
//        sb是一个容器，是可以变化的
        sb.append("aaa").append("bbb").append("ccc");
        System.out.println(sb);
//        将StringBuilder变回字符串
        String string = sb.toString();
        System.out.println(string);
    }
}
