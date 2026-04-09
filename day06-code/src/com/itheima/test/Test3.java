package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        int[][] yearArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum = 0;
        for (int i = 0; i < yearArr.length; i++) {
            int[] quarterArr = yearArr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i+1) + "个季度的营业额为：" + sum);
            yearSum+=sum;
        }
        System.out.println("全年的总营业额为：" + yearSum);
    }
//    定义一个方法，计算每一个季度的营业额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
