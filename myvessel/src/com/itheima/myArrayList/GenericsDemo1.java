package com.itheima.myArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {

        MyArrayList1<String> list1 = new MyArrayList1<>();

        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");

        System.out.println(list1);

        MyArrayList1<Integer> list2 = new MyArrayList1<>();

        list2.add(123);
        list2.add(456);
        list2.add(789);

        Integer i = list2.get(0);
        System.out.println(i);
        System.out.println(list2);
    }
}
