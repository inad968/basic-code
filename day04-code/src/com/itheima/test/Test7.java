package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的价格：");
        int ticketPrice = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入购买的舱位：0表示头等舱，1表示经济舱：");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
            ticketPrice = getPrice(ticketPrice, seat, 0.7, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            ticketPrice = getPrice(ticketPrice, seat, 0.9, 0.95);

        } else {
            System.out.println("输入的月份有误！");
        }
        System.out.println("机票的价格为：" + ticketPrice);
    }

    public static int getPrice(int ticketPrice, int seat, double v0, double v1) {
        if (seat == 0) {
            ticketPrice = (int) (ticketPrice * v0);
        } else if (seat == 1) {
            ticketPrice = (int) (ticketPrice * v1);
        } else {
            System.out.println("输入的舱位有误！");
        }
        return ticketPrice;
    }
}
