package com.itheima.sort;

public class RecursionDemo1 {
    public static void main(String[] args) {
        //利用递归的思想求1-100的和
        //递归的关键：一定要有一个出口
        System.out.println(getSum(100));

    }

    public static int getSum(int num){
        if(num == 1){
            return 1;
        }
        return num +getSum(num - 1);
    }
}
