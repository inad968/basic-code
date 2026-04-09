package com.itheima.search;

import java.util.ArrayList;

public class BasicSearchDemo {
    public static void main(String[] args) {
        //基本查找，顺序查找
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int num = 81;
        ArrayList<Integer> result = basicSearch(arr, num);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static ArrayList<Integer> basicSearch(int[] arr,int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                list.add(i);
            }
        }
        return list;
    }
}
