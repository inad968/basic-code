package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {

        System.out.println(toBinaryString(123));
        System.out.println(Integer.toBinaryString(123));
    }

    public static String toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
        while (true){
            //循环结束条件：1.开始传入的num不能为0。 2.num/2，直到num=0时结束
            if(num == 0){
                break;
            }
            //获取余数
            int remainder = num % 2;
            sb.insert(0,remainder);
            //实现6/2；3/2；1/2，即刷新num
            num = num / 2;
        }
        return sb.toString();
    }
}
