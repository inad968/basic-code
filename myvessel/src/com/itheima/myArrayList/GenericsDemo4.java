package com.itheima.myArrayList;

import java.util.ArrayList;

public class GenericsDemo4 {
    public static void main(String[] args) {

        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<zi> list3 = new ArrayList<>();

        //泛型不具备继承性，所以传入的数据有局限性
        //解决方法：使用通配符?
        method(list1);
//        method(list2); 会报错

        //数据具备继承性
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new zi());

    }

    public static void method(ArrayList<Ye> list) {

    }
}

class Ye {
}

class Fu extends Ye {
}

class zi extends Fu {
}