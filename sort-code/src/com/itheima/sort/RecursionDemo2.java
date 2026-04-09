package com.itheima.sort;

public class RecursionDemo2 {
    public static void main(String[] args) {
        //递归在内存中的逻辑是：
        //每次调用方法，方法加载进栈，直到num=1，方法结束，此时方法需要出栈
        //方法执行完毕后需要出栈，出栈时，把方法的返回值逐级返回给上一级的方法调用处
        System.out.println(getFactorial(5));
    }

    public static int getFactorial(int num){
        if(num == 1){
            return 1;
        }
        return num * getFactorial(num - 1);
    }
}
