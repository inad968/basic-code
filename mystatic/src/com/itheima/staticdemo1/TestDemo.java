package com.itheima.staticdemo1;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
//        工具类   调用静态方法
//        类名.static方法
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.5, 3.7, 4.5, 6.6, 7.9};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
