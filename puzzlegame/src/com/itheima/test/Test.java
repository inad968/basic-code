package com.itheima.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //1.定义一个一维数组
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int x =0;
        int y =0;

        //2.打乱一维数组组
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        //3.遍历一维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //4.将打乱后一维数组中的值赋值给一个二维数组
        int[][] data = new int[4][4];
        int num = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(arr[num] == 0){
                    x = j;
                    y = i;
                    System.out.println(x);
                    System.out.println(y);
                }else {
                    data[j][i] = arr[num];
                }
                num++;
            }
        }

        //5.遍历二维数组
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[j][i] + " ");
            }
            System.out.println();
        }
    }
}
