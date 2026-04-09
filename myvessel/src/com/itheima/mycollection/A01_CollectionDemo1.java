package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

        //添加数据,Boolean类型
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        System.out.println(coll);

        //删除数据，Boolean类型
        coll.remove("aaa");
        System.out.println(coll);

        //判断是否包含,底层的逻辑是object的equals方法，比较地址值
        //这里的String已经重写过equals方法，比较的是属性值
        boolean result = coll.contains("bbb");
        System.out.println(result);

        boolean result1 = coll.isEmpty();
        System.out.println(result1);

        int size = coll.size();
        System.out.println(size);
    }
}
