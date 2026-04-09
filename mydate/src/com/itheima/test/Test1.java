package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个整数：");
            String s = sc.nextLine();
            int i = Integer.parseInt(s);
            if(i < 1 || i > 100){
                System.out.println("数据异常，请重新输入！");
                continue;
            }
            list.add(i);
            int sum = getSum(list);
            if(sum > 200){
                System.out.println("集合中数据和已满足要求");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer i1 = list.get(i);
            sum+=i1;
        }
        return sum;
    }
}
