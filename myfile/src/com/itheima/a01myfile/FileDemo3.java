package com.itheima.a01myfile;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {

        File f = new File("D:\\aaa");

        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file);
            }
        }
    }
}
