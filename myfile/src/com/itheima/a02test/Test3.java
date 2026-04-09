package com.itheima.a02test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //***谨慎操作***
        //***谨慎操作***
        //***谨慎操作***
        find();

    }
    public static void find(){
        //获取本地所有的盘符
        File[] arr = File.listRoots();
        for (File f : arr) {
            find(f);
        }
    }

    public static void find(File src) {
        //获取盘符中所有的内容
        File[] files = src.listFiles();
        //对files做一个判断，因为有些文件没有访问权限
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    if (name.endsWith(".avi")) {
                        System.out.println(file);
                    }
                } else {
                    //如果不是文件，则是一个文件夹
                    //此时用递归的思想再次调用find()方法
                    find(file);
                }
            }
        }

    }
}
