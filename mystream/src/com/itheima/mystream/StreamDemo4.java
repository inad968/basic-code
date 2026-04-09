package com.itheima.mystream;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }
}
