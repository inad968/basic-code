package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
//        字符串的replace方法，敏感词的屏蔽
        String talk = "紫色，别TMD搁那儿断了，你耳朵隆吗";
//        定义一个敏感词库
        String[] arr = {"TMD","隆"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
