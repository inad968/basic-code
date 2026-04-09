package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "张三丰-100", "赵敏-16", "小师妹-14", "灭绝师太-99", "金毛狮王-100");
        //统计
        long count = list.stream().count();
        System.out.println(count);

        //收集:toArray()该方法可以收集流中的数据，并放到数组中
        /*IntFunction<? extends Object[]>,<>括号里面表示谁继承object类型的数组
        * 即，任意object的子类数组都可以。所以，它的泛型为任意数据类型的数组
        *方法的形参value表示流中数据的个数*/
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        //Arrays.toString(arr)，该方法可以把数组变成字符串
        //与之对应的是，toCharArr,可以把字符串变成字符数组
        System.out.println(Arrays.toString(arr));

        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));
    }
}
