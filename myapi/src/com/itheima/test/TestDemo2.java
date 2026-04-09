package com.itheima.test;

public class TestDemo2 {
    public static void main(String[] args) {

        System.out.println(getSum(12));
    }

    //递归要注意的是：1.对传入的数据进行筛查 2.需要定义递归的出口 3.找到递归的规律
    public static int getSum(int month){
        if(month == 1 || month == 2){
            return 1;
        }
        return getSum(month - 1) + getSum(month - 2);
    }
}
