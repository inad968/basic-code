package com.itheima.sort;

public class QuickSortDemo {
    public static void main(String[] args) {
        //利用快速排序的思想
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        //递归的出口
        if(start > end){
            return;
        }

        //记录基准数
        int baseNum = arr[i];

        while (start != end) {
            //先移动end，从后往前找比baseNum小的数
            while (true) {
                if (end <= start || arr[end] < baseNum) {
                    break;
                }
                end--;
            }
            //再移动start，从前往后找比baseNum大的数
            while (true) {
                if (end <= start || arr[start] > baseNum) {
                    break;
                }
                start++;
            }
            //找到之后，break，交换start和end的数据
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //第一轮循环结束，将第一个基准数归位
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //利用递归，以6为基准，把6左边以及把6右边的数字进行快速排序
        quickSort(arr,i,start - 1);
        quickSort(arr,start + 1,j);
    }
}
