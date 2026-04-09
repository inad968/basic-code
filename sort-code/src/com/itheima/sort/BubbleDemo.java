package com.itheima.sort;

public class BubbleDemo {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 3, 1};

        //对数组进行冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            //外循环表示要执行的次数，即内循环要执行多少次
            //这里的i表示次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //内循环表示排序的规则
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
