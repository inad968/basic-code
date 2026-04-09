package com.itheima.stringdemo;

public class StringDemo4 {
    //    有时候需要定义一个方法，去完成特定的需求。比如本题。
//    定义方法的时候，也需要考虑比如数组是否可能为空，
//    即需要在方法中多次用到for循环，以及if判断，以及他们的嵌套
    public static void main(String[] args) {
//        定义一个方法把数组中的数据拼接成字符串。
        int[] arr = {1,2,3,4,5};
        String str = arrToString(arr);
        System.out.println(str);

    }

    public static String arrToString(int[] arr) {
//        先对传进来的数组进行判断
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
//        和int sum = 0;类似
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        return result;
    }
}
