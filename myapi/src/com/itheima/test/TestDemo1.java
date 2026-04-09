package com.itheima.test;

import java.util.Arrays;
import java.util.Comparator;

public class TestDemo1 {
    public static void main(String[] args) {

        Friend f1 = new Friend("zhangsan", 22, 1.70);
        Friend f2 = new Friend("lisi", 23, 1.75);
        Friend f3 = new Friend("lisi", 23, 1.76);
        Friend f4 = new Friend("wangwu", 23, 1.76);

        Friend[] arr = {f1, f2, f3, f4};

        Arrays.sort(arr, new Comparator<Friend>() {
            @Override
            public int compare(Friend o1, Friend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0) {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
