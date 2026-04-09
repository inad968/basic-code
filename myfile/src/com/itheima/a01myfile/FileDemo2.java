package com.itheima.a01myfile;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {

        File f1 = new File("D:\\aaa");
        //调用该方法，获取aaa下所有的内容，返回到一个数组中
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
