package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        int num = 12345;
        int temp = num;
        int count = 0;
//        计算num的位数
        while (num != 0){
           num = num / 10;
           count++;
        }
//        将位数作为数组长度，动态初始化数组
        int[] arr = new int[count];
        int index = arr.length-1;
        while (temp != 0){
            int ge = temp % 10;
            arr[index] = ge;
            index--;
            temp = temp / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
//        密码加密

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int num1 = 0;
        for (int i = 0; i < arr.length; i++) {
            num1 = num1 * 10 + arr[i];
        }
        System.out.println(num1);
    }
}
