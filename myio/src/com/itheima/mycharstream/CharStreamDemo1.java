package com.itheima.mycharstream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("myio\\b.txt");

        //read的读取细节，底层也是一个字节一个字节的读取，因为数据是以二进制的形式存储的
        // 遇到中文则一次读取多个字节
        //读取之后，会将读取到的字节进行解码，去掉1110，10，10，并转成十进制
        //最终把这个十进制作为返回值
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print(ch);
            System.out.print((char) ch);
        }

        fr.close();
    }
}
