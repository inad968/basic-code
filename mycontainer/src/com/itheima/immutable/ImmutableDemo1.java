package com.itheima.immutable;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        //set\list\map这三个接口，可以调用of方法创建一个不可变集合
        Set<String> set = Set.of("张三", "李四", "王五", "赵六", "钱七");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
