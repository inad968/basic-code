package com.itheima.search;

public class BinarySearchDemo {
    public static void main(String[] args) {
        //二分查找:定义的数组必须是有序的
        //二分查找的关键：一直折半，直到arr[mid]==num,再返回mid
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int num = 81;
        System.out.println(binarySearch(arr, num));
    }

    public static int binarySearch(int[] arr, int num) {
        //二分查找需要先定义min、max索引
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            if (min > max) {
                return -1;
            }
            int mid = (min + max) / 2;
            if (arr[mid] > num) {
                max = mid - 1;
            }else if(arr[mid] < num){
                min = mid + 1;
            }else if (arr[mid] == num){
                return mid;
            }
        }

    }
}
