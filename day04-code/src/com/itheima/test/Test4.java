package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean flag = contains(arr,20);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;

            }
        }
        return false;
    }
}
