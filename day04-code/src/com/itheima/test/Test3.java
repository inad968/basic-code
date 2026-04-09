package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;
    }
}
