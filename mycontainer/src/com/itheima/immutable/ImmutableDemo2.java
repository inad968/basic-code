package com.itheima.immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("张三", "天津");
        hm.put("李四", "武汉");
        hm.put("王五", "合肥");
        hm.put("赵六", "济南");
        hm.put("钱七", "青海");

        Set<Map.Entry<String, String>> entries = hm.entrySet();

        Map.Entry[] arr = entries.toArray(new Map.Entry[0]);

        Map map = Map.ofEntries(arr);

        Set set = map.keySet();
        for (Object o : set) {
            Object value = map.get(o);
            System.out.println(o + "=" + value);
        }
    }
}
