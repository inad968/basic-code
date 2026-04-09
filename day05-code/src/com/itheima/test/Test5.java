package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
//        密码解密
        int[] arr = {8, 3, 4, 6};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >=0 && arr[i] <= 4){
                arr[i] = arr[i] + 10 ;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
    }
}
