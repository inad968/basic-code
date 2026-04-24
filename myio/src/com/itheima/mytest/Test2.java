package com.itheima.mytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //利用异或运算，在拷贝的基础上对文件进行加密
        FileInputStream fis = new FileInputStream("myio\\background.jpg");
        FileOutputStream fos = new FileOutputStream("myio\\ency.jpg");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 88);
        }
        fos.close();
        fis.close();
    }
}
