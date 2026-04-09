package com.itheima.myArrayList;

import java.util.ArrayList;

public class ListUtil {
    //工具类，构造方法私有化
    private ListUtil() {
    }

    //泛型方法的编写
    public static <T> void addAll1(ArrayList<T> list, T t1, T t2, T t3, T t4) {
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
    }

    public static<T> void addAll2(ArrayList<T> list,T...t) {
        for (T element : t) {
            list.add(element);
        }
    }

}
