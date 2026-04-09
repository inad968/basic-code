package com.itheima.myArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {

        MyArrayList2 list2 = new MyArrayList2();
        list2.add("aaa");
        list2.add("bbb");
        System.out.println(list2);

        MyArrayList3<Integer> list3 = new MyArrayList3<>();
        list3.add(111);
        list3.add(222);
        list3.add(333);
        System.out.println(list3);
    }
}
