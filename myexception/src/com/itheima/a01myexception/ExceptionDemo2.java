package com.itheima.a01myexception;

import java.util.Arrays;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }

        System.out.println(Arrays.toString(arr));
    }
}
