package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
//        StringJoiner可以添加中间，开头，结尾
        StringJoiner sj = new StringJoiner("***","[","]");
        sj.add("你").add("会不会玩游戏，").add("回去挂机");
        System.out.println(sj);
        String string = sj.toString();
        System.out.println(string);
    }
}
