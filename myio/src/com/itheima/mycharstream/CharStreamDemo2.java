package com.itheima.mycharstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //字符流的底层会有一个缓冲区，大小为8192字节的数组
        // FileWriter fw = new FileWriter("myio\\a.txt");字符输出流，它会清空原文件
        FileWriter fw = new FileWriter("myio\\a.txt");

        fw.write("你是吴彦祖");
        fw.write("那我是谁");

        fw.flush();

        fw.write("收手吧，阿祖");
        fw.close();
    }
}
