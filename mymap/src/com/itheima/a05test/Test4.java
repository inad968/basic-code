package com.itheima.a05test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list1 = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list1, "火男", "幽影", "铁壁", "保安", "烟男", "壹绝", "夜露", "捷风", "奶妈", "钢索");
        //3.这里用到第二个思想，创建一个临时的集合，用来存已经被点到名字的学生
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("--------第" + i + "轮点名开始了--------");
            //4.获取集合初始的长度
            int size = list1.size();
            //5.随机点名
            Random r = new Random();
            for (int j = 0; j < size; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                if (j < 9) {
                    System.out.print(name + ", ");
                } else {
                    System.out.println(name);
                }
            }
            list1.addAll(list2);
            list2.clear();
        }

    }
}
