package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {

        Map<String,Double> map = new HashMap<>();
        //put操作，有两层含义：添加和覆盖
        map.put("脉动",5.0);
        map.put("尖叫",5.0);
        Double v1 = map.put("可口可乐", 3.5);
        Double v2 = map.put("可口可乐", 5.0);
        map.put("北冰洋",5.0);
        //此时3.5被覆盖了，返回的是被覆盖的值
        System.out.println(v1);
        System.out.println(v2);

        System.out.println(map);
    }
}
