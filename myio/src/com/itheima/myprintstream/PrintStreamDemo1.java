package com.itheima.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //字节打印流：只有输出流，没有输入流
        PrintStream ps = new PrintStream(new FileOutputStream("myio\\a1.txt"),true, Charset.forName("UTF-8"));
        //字节打印流特有的打印输出方法：占位符
        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf("%s爱上了%s","阿珍","阿强");

        ps.close();
    }
}
