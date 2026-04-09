package com.itheima.immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        //List\Set\Map,接口名调用of\ofEntries\copyOf。来实现创建不可变集合
        //不可变集合的应用：比如集合中存放了一副扑克，这时该集合就应该是不可变集合
        //因为，如果改变牌的数量，就存在出老千的可能。
        HashMap<String, String> hm = new HashMap<>();

        hm.put("张三", "天津");
        hm.put("李四", "武汉");
        hm.put("王五", "合肥");
        hm.put("赵六", "济南");
        hm.put("钱七", "青海");

        Map<String, String> map = Map.copyOf(hm);

    }
}
