package com.itheima.test8;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            System.out.println("请输入第" + (i + 1) + "辆车的品牌：");
            String brand = sc.next();
            car.setBrand(brand);
            System.out.println("请输入第" + (i + 1) + "辆车的价格：");
            double price = sc.nextDouble();
            car.setPrice(price);
            System.out.println("请输入第" + (i + 1) + "辆车的颜色：");
            String color = sc.next();
            car.setColor(color);
            arr[i] = car;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println("第" + (i + 1) + "辆车的品牌是：" + car.getBrand() +
                    "，价格是：" + car.getPrice() + "，颜色是：" + car.getColor());
        }
    }
}
