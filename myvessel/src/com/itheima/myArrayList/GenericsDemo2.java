package com.itheima.myArrayList;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        ListUtil.addAll1(list1,"aaa","bbb","ccc","ddd");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        ListUtil.addAll2(list2,1,2,3,4,5,6,111,222);
        System.out.println(list2);
    }
}
