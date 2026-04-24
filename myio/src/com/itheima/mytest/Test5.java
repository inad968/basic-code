package com.itheima.mytest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test5 {
    public static void main(String[] args) throws IOException {
        //读取数据源中的数据存储到集合中
        BufferedReader br = new BufferedReader(new FileReader("myio\\e.txt"));

        String line;
        ArrayList<String> list = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        //对集合进行排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });

        //将集合中的数据写入目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\result.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
