package com.itheima.a02test;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        boolean b = haveAvi(file);
        System.out.println(b);
    }

    public static boolean haveAvi(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()&&f.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}
