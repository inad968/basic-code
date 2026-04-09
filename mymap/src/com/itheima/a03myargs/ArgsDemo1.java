package com.itheima.a03myargs;

public class ArgsDemo1 {
    public static void main(String[] args) {

        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sum);
    }

    public static int getSum(int... args) {
        int sum = 0;
        //args的底层是一个数组
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }
}
