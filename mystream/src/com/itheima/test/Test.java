package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"曹操-55","张飞-50","刘备-55","孙权-40","关羽-49");

        List<Actor> newList = list.stream().map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                //return什么要根据返回值来写，这里的返回值是一个Actor对象
                String name = s.split("-")[0];
                int age = Integer.parseInt(s.split("-")[1]);
                return new Actor(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(newList);
    }
}
