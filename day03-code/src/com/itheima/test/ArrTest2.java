package com.itheima.test;

public class ArrTest2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,66,76,81};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else {
                arr[i] = arr[i] * 2;
            }
        }
        //数据变化
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
