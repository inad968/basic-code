package com.itheima.test;

public class ArrTest1 {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {10,20,30,40,50,66,76,81};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
