package com.itheima.a01myfunction;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        //方法引用：如果一个方法的参数是一个接口，而且是一个函数式接口。
        // 此时我们就把已有的方法拿过来，当作接口中抽象方法的方法体
        //所以方法引用时，引用处必须是函数式接口
        Integer[] arr = {5, 3, 4, 6, 1, 3, 2};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println();

        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));

        System.out.println();
        //表示引用这个类里的这个方法
        Arrays.sort(arr,FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }
}
