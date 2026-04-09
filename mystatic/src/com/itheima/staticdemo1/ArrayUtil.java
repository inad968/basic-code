package com.itheima.staticdemo1;

public class ArrayUtil {
    //    工具类，私有化构造方法
    private ArrayUtil() {
    }

    //    数组的遍历：把数组中的元素一个一个的取出来，然后再以字符串的形式输出
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
