package com.itheima.a05test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"火男","奶妈","捷风","幽影","钢索","烟男","蝰蛇","壹绝","慕蝶","保安");

        //实现随机点名，有两种方式
        Random r = new Random();
        int index = r.nextInt(list.size());
        String name1 = list.get(index);
        System.out.println(name1);

        //第二种方式
        Collections.shuffle(list);
        String name2 = list.get(0);
        System.out.println(name2);
    }
}
