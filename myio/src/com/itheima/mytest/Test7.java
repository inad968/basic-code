package com.itheima.mytest;

import java.io.*;

public class Test7 {
    public static void main(String[] args) throws IOException {
        //表示刚注册好账号，读取默认count值
        BufferedReader br = new BufferedReader(new FileReader("myio\\count.txt"));
        String line = br.readLine();
        br.close();

        //点击运行，则表示开始使用本软件，所以count++；
        int count = Integer.parseInt(line);
        count++;
        if (count <= 3) {
            System.out.println("今日有三次免费观影次数，您还剩余" + (3 - count) + "次观影机会");
        } else {
            System.out.println("今日观影次数已用完，请充值会员后继续使用");
        }

        //将自增之后的count写出到原文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\count.txt"));
        bw.write(count + "");//此处的count是整型，加引号，拼接成字符串
        bw.close();
    }
}
