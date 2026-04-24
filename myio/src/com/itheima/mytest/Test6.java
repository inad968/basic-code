package com.itheima.mytest;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test6 {
    public static void main(String[] args) throws IOException {
        //基于TreeMap的自动排序功能，将序号，及对应的句子以键值对的形式存入集合中
        BufferedReader br = new BufferedReader(new FileReader("myio\\e.txt"));

        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();

        while ((line = br.readLine())!=null){
            tm.put(Integer.parseInt(line.split("\\.")[0]),line.split("\\.")[1]);
        }
        br.close();
//        System.out.println(tm);

        //写入目的地
        //对单双列集合以及字符串的成员方法的综合运用
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio\\result1.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
