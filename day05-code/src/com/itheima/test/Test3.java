package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
//        将一个整数各位加5后取个位，反转后输出
//        密码加密
        int[] arr = {1, 9, 8, 3, 5};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
    }
}
