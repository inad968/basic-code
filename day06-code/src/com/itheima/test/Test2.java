package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        arr[0] = arr1;
        arr[1] = arr2;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
