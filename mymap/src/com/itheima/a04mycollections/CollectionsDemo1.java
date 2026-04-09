package com.itheima.a04mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list,"abc","bcd","aaa","zzz","xbs","qwer");
        System.out.println(list);
        //打乱集合的数据
        Collections.shuffle(list);
        System.out.println(list);
    }
}
