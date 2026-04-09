package com.itheima.stringbuilder;

public class StringBuilderDemo2 {
//    stringbuilder用于字符串的拼接和反转
//    但最后要调用tostring方法
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
//        开头
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
//        中间
            }
        }
        sb.append("]");
//        结尾
        return sb.toString();
    }
}
