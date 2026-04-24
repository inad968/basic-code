package com.itheima.mytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //对加密文件进行解密
        FileInputStream fis = new FileInputStream("myio\\ency.jpg");
        FileOutputStream fos = new FileOutputStream("myio\\redu.jpg");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 88);
        }
        fos.close();
        fis.close();
    }
}
