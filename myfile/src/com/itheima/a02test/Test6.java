package com.itheima.a02test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {

        File file = new File("D:\\aaa");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);
    }

    //需求：定义一个方法，统计一个文件夹中文件的类型和数量
    //涉及到统计以及两个变量，所以我们用集合来完成
    public static HashMap<String, Integer> getCount(File src) {
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                //文件可能的类型如下：
                //.txt\a.a.doc\无后缀名
                String name = file.getName();
                String[] arr = name.split("\\.");
                String endName = arr[arr.length - 1];
                if (hm.containsKey(endName)) {
                    int count = hm.get(endName);
                    count++;
                    hm.put(endName, count);
                } else {
                    hm.put(endName, 1);
                }
            } else {
                //此处递归，调用getCount方法后，又创建了一个集合用来统计子文件夹
                HashMap<String, Integer> sonMap = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    //汇总：相当于len = len + getLen(file);
                    if (hm.containsKey(key)) {
                        int count = hm.get(key);
                        count = count + value;
                        hm.put(key,value);
                    } else {
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }
}
