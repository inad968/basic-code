package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 99, 8, 13, 21};
        int[] copyArr = copyofRange(arr, 2, 6);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }

    public static int[] copyofRange(int[] arr, int from, int to) {
        int index = 0;
        int[] newArr = new int[to - from];
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;

        }
        return newArr;
    }
}
