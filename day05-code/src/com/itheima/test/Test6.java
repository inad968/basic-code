package com.itheima.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {20, 588, 888, 1288, 1888};
        int[] newArr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = r.nextInt(arr.length);
            int price = arr[randomIndex];
            boolean flag = contains(newArr, price);
            if (!flag) {
                newArr[i] = price;
                i++;
                System.out.println("恭喜你，抽中了" + price + "元");

            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

        public static boolean contains ( int[] arr, int price){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == price) {
                    return true;

                }
            }
            return false;
        }
    }

