package com.itheima.mybufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //bw.newLine();换行方法，根据相应的操作系统，写出对应的换行符
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\d.txt"));

        bw.write("我想吃红苕稀饭");
        bw.newLine();
        bw.write("我需要猫咪");
        bw.newLine();

        bw.close();
    }
}
