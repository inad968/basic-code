package com.itheima.a05arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayDemo2 {
    public static void main(String[] args) {
        //利用插入排序和二分查找的方式进行排序的
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("-----------");
                System.out.println("o1:" + o1);
                System.out.println("o2:" + o2);
                return o1 - o2;
            }
        });
        //o1 - o2 是升序排列
        //o2 - o1 是降序排列
        System.out.println(Arrays.toString(arr));
    }
}
