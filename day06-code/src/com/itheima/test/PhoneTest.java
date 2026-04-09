package com.itheima.test;

public class PhoneTest {
    //     测试类
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "华为";
        phone.price = 4999.99;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        phone.call();
        phone.sendMessage();
    }
}
