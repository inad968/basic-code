package com.itheima.doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();

    static HashMap<String, Integer> hm = new HashMap<>();

    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 大王");
        list.add(" 小王");

        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //遍历牌盒取出每一张牌,再添加到其余四个集合，表示发牌的过程
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2) {
                lord.add(poker);
                continue;
            }
            //利用i%3的结果有三种情况：0，1，2，来给三位玩家依次发牌
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }
        /*排序，此时要注意小王和大王和其它牌的构成是不同的。
        * 比如"♥3"，0索引表示花色，1索引表示价值；但"小王"的0索引是"小",1索引表示"王"。
        * 按照这个逻辑，我们在add的时候，要在"小王"的前面加一个空格表示它的花色，
        * " 小王"，" 大王"，把小王，大王这个整体表示成价值
        * */
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        lookPoker("底牌",lord);
        lookPoker("伞兵一号",player1);
        lookPoker("高进",player2);
        lookPoker("法国赌神",player3);
    }

    //利用牌的价值对整副牌进行排序
    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            //o1表示要插入的牌；o2表示已经在有序序列中存在的牌
            @Override
            public int compare(String o1, String o2) {
                //计算要插入的牌的花色和价值
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
                //计算已存在的牌的花色和价值
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);
                /*排序的规则：先比较价值，对价值进行排序；
                如果相同，则比较花色
                最后i的结果正数，负数，0。*/
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    //计算牌的价值
    public int getValue(String poker) {
        String num = poker.substring(1);
        if (hm.containsKey(num)) {
            return hm.get(num);
        } else {
            return Integer.parseInt(num);
        }
    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
