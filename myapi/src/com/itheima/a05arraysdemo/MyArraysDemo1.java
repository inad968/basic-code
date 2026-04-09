package com.itheima.a05arraysdemo;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        //Arrays工具类，对数组进行操作
        System.out.println("-------toString-------");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));

        System.out.println("-------binarySearch-------");
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 9));
        System.out.println(Arrays.binarySearch(arr, 20));

        System.out.println("-------copyOf-------");
        int[] newArr = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr));

        System.out.println("-------copyOfRange-------");
        int[] newArr1 = Arrays.copyOfRange(arr, 0, 7);
        System.out.println(Arrays.toString(newArr1));

        System.out.println("-------sort-------");
        //默认给基本数据类型的数组进行升序排序
        int[] arr2 = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
