package com.itheima.a02test;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {

        File src = new File("D:\\aaa");
        //***谨慎操作***
        //***谨慎操作***
        //***谨慎操作***
        delete(src);
    }

    public static void delete(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    delete(file);
                }
            }
            src.delete();
        }

    }
}
