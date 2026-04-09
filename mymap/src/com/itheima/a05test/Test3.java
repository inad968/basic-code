package com.itheima.a05test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"火男","幽影","铁壁","保安","烟男","壹绝","夜露","捷风","奶妈","钢索");
        /*由于集合的长度是可以发生变化的，动态的，所以这里的list.size()是会一直变小
        Random r = new Random();
        for (int i = 0; i < list.size(); i++) {
            int index = r.nextInt(list.size());
            String name = list.remove(index);
            System.out.print(name + ", ");
        }*/

        //所以我们要用到一个思想，把list.size()先传递给第三方变量。把初始的长度存储起来
        int size = list.size();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            //此时size不会再变化
            int index = r.nextInt(list.size());
            String name = list.remove(index);
            if(i < 9){
                System.out.print(name + ", ");
            }else {
                System.out.println(name);
            }
        }
    }
}
