package com.itheima.sort;

public class SelectionDemo {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 3, 1};

        //通过选择排序对数组进行排序
        for (int i = 0; i < arr.length - 1; i++) {
            //需要明白外循环的i表示的是什么
            //这里的i表示的是这一轮中我拿着哪个索引上的数据跟后面的数据进行比较，交换
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
