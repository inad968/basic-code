package com.itheima.test;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
//          打乱数组，打乱奖池顺序
        int[] arr = {20, 588, 888, 1288, 1888};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}