package com.itheima.mybytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("myio\\a.txt");
        //读取的数据存储在引用数据类型数组中，数组的长度是多少，一次就读取多少，把数据装满
        byte[] bytes = new byte[2];

        int len1 = fis.read(bytes);
        System.out.println(len1);
        String str1 = new String(bytes,0,len1);
        System.out.println(str1);

        //第二次读取，由于只创建了一个数组，所以会对之前的数据进行覆盖
        int len2 = fis.read(bytes);
        System.out.println(len2);
        String str2 = new String(bytes,0,len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);
        System.out.println(len3);
        String str3 = new String(bytes,0,len3);
        System.out.println(str3);

        fis.close();
    }
}
