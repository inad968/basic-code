package com.itheima.myArrayList;

import java.util.Arrays;

public class MyArrayList1<E> {
    //泛型类的编写
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E) obj[index];
    }

    //重写toString()方法，此时打印对象obj时，就不是地址值了，而是对象内部的属性值，即内容
    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
