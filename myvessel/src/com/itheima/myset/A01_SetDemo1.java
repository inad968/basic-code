package com.itheima.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_SetDemo1 {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        //第一个特点：元素不能重复
        boolean b1 = s.add("张三");
        boolean b2 = s.add("张三");
        s.add("李四");
        s.add("王五");
        System.out.println(b1);
        System.out.println(b2);
        //第二个特点：无序，存和取的顺序不同
        System.out.println(s);

        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.print(str + ", ");
        }

        for (String str : s) {
            System.out.print(str + ", ");
        }

        s.forEach(str -> System.out.print(str + ", "));

    }
}
