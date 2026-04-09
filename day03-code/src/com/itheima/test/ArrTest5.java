package com.itheima.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,66,76,81};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
