package com.itheima.test;

public class ArrTest4 {
    public static void main(String[] args) {
        int[] arr = {10,20,3,55,88,66,76,81};
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
