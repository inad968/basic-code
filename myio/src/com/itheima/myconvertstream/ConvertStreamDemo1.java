package com.itheima.myconvertstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //转换流的作用：本质是一个字符流，可以将字节流转换成字符流
        //将字节流变成字符流，再将字符流包装成缓冲流
        //综上：转换流有两个作用，其一为可以指定字符集读取数据，其二为将字节流转换成字符流
        FileInputStream fis = new FileInputStream("myio\\a.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }
}
