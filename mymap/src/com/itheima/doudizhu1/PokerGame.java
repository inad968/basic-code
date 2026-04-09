package com.itheima.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //该集合表示牌盒，用来装color和number
    static ArrayList<String> list = new ArrayList<>();

    /*将准备牌的代码放到静态代码块中，因为牌只需要一副
    避免每次调用构造方法都要准备一副牌*/
    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("大王");
        list.add("小王");
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
        //看牌
        lookPoker("底牌",lord);
        lookPoker("伞兵一号",player1);
        lookPoker("高进",player2);
        lookPoker("法国赌神",player3);
    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
