package com.itheima.mybufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流：readline()方法,如果没有数据可读，就返回null
        BufferedReader br = new BufferedReader(new FileReader("myio\\a.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
