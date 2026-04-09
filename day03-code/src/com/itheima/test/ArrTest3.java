package com.itheima.test;

import java.util.Random;

public class ArrTest3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("数组元素的和是：" + sum);

        int avg = sum / arr.length;
        System.out.println("数组元素的平均值是：" + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > avg){
                count++;
            }
        }
        System.out.println("数组中大于平均值的元素个数是：" + count);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
