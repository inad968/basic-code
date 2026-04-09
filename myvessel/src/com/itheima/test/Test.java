package com.itheima.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //通配符的使用
        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        PersianCat cat1 = new PersianCat();
        cat1.setName("哈吉咪");
        cat1.setAge(1);
        list1.add(cat1);

        HuskyDog dog1 = new HuskyDog();
        dog1.setName("二哈");
        dog1.setAge(1);
        HuskyDog dog2 = new HuskyDog();
        dog2.setName("哈吉哈");
        dog2.setAge(2);
        list4.add(dog1);
        list4.add(dog2);

        keepPet1(list1);
        keepPet1(list2);

        keepPet2(list3);
        keepPet2(list4);
    }

    public static void keepPet1(ArrayList<? extends Cat> list) {
        //这里的形参是，需要传入的是一个集合，是集合就要考虑到集合的类型
        //<>这里表示能传入的数据是Cat或者Cat的子类
        for (int i = 0; i < list.size(); i++) {
            Cat cat = list.get(i);
            System.out.println(cat.getName()+", "+cat.getAge());
            cat.eat();
        }

    }

    public static void keepPet2(ArrayList<? extends Dog> list) {
        //表示能传入的数据是Dog或者Dog的子类
        for (Dog dog : list) {
            System.out.println(dog.getName()+", "+dog.getAge());
            dog.eat();
        }
    }
}
