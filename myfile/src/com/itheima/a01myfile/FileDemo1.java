package com.itheima.a01myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("D:\\aaa\\a.txt");
        //如果路径不存在，则创建失败。且只能创建文件
        boolean b = f1.createNewFile();
        System.out.println(b);

        File f2 = new File("D:\\aaa\\bbb");
        boolean b1 = f2.mkdir();
        System.out.println(b1);

        File f3 = new File("D:\\aaa\\aaa\\bbb\\ccc");
        boolean b2 = f3.mkdirs();
        System.out.println(b2);
    }
}
