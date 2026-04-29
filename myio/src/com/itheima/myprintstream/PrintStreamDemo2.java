package com.itheima.myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //字符打印流:高级流，只有输出流
        PrintWriter pw = new PrintWriter(new FileWriter("myio\\b1.txt"),true);

        pw.println("你昏倒的时候叫晶晶这个名字，叫了98次");
        pw.print("还有一个叫紫霞的，你叫了784次");

        pw.close();
    }
}
