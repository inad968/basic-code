package com.itheima.mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test4 {
    public static void main(String[] args) throws IOException {

        //将数据源中的数据读取到内存中
        FileReader fr = new FileReader("myio\\c.txt");
        StringBuilder sb = new StringBuilder();

        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        System.out.println(sb);

        //排序(将字符串类型的数据变成整形的数据)
        String str = sb.toString();
        String[] arrStr = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);

        //将内存中的数据写入目的地
        FileWriter fw = new FileWriter("myio\\c.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                fw.write(list.get(i)+"");
            } else {
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
