package com.itheima.a05test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);

        Collections.shuffle(list);
        Random r = new Random();
        int index = r.nextInt(list.size());
        Integer num = list.get(index);

        ArrayList<String> maleList = new ArrayList<>();
        ArrayList<String> femaleList = new ArrayList<>();

        Collections.addAll(maleList,"火男","幽影","铁壁","保安","烟男","壹绝","夜露");
        Collections.addAll(femaleList,"捷风","奶妈","钢索");

        if(num == 1){
            //表示抽取男生
            int maleIndex = r.nextInt(maleList.size());
            String name1 = maleList.get(maleIndex);
            System.out.println(name1);
        }else {
            //表示抽取女生
            int femaleIndex = r.nextInt(femaleList.size());
            String name2 = femaleList.get(femaleIndex);
            System.out.println(name2);
        }

    }
}
