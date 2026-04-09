package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
       /* for (int i = 1; i <= 5; i++) {
            if(i == 3){
                continue;
            }
            System.out.println("小老虎在吃第"+ i + "个包子");
        }*/
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第"+ i + "个包子");
            if(i == 3){
                break;
            }
            //语句的执行顺序
        }
    }
}
