package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        coll.add("xiaoli");

        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        });

        coll.forEach(string -> System.out.println(string));
    }
}
