package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A04_MapDemo4 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("射手", "女警");
        map.put("辅助", "拉克丝");
        map.put("打野", "蔚");
        map.put("上单", "慎");
        //第三种遍历方式：lambda
        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
