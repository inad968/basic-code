package com.itheima.test;

import java.util.ArrayList;

public class ArrayTest3 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米", 2999);
        Phone p2 = new Phone("华为", 2899);
        Phone p3 = new Phone("苹果", 4999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone p = phoneInfoList.get(i);
            System.out.println(p.getPrice() + "," + p.getBrand());
        }
    }

    //    定义一个方法返回数据
//    可能返回单个数据，可能返回多个数据
//    返回多个数据时，可以将其放入集合或数组中
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price < 3000) {
                resultList.add(p);
            }
        }
        return resultList;
    }
}
