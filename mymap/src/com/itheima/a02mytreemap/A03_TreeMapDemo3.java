package com.itheima.a02mytreemap;

import java.util.StringJoiner;
import java.util.TreeMap;

public class A03_TreeMapDemo3 {
    public static void main(String[] args) {

        String str = "aababcabcdabcde";

        TreeMap<Character,Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(tm.containsKey(c)){
                Integer count = tm.get(c);
                count++;
                tm.put(c,count);
            }else {
                tm.put(c,1);
            }
        }

        System.out.println(tm);

        //遍历集合，并按照指定的格式进行拼接
        StringBuilder sb = new StringBuilder();
        tm.forEach((key,value)->sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);
        System.out.println(sb.toString());

        StringJoiner sj = new StringJoiner("","","");
        //这里的key+""表示key不是字符串，我们让它+上""，拼接之后的整体就成了一个字符串
        tm.forEach((key,value)->sj.add(key+"").add("(").add(value+"").add(")"));
        System.out.println(sj);
    }
}
