package com.itheima.a02test;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        //这个例子的意义是：递归之后，返回值返回到调用出，用一个变量去接收
        File src = new File("D:\\aaa");
        getLen(src);
        System.out.println(getLen(src));
    }

    //该方法用来计算每个文件夹的大小，文件夹的大小即里面所有文件的大小进行累加
    public static long getLen(File src) {
        long len = 0;
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                len = len + file.length();
            } else {
                //getLen该方法算出每一个文件夹的大小
                //把返回值return到方法调用出
                len = len + getLen(file);
            }
        }
        return len;
    }
}
