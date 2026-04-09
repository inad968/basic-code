package com.itheima.doudizhu2;

import java.util.*;

public class PokerGame {
    /*如果有对应关系，就应该想到键值对，就应该使用map集合
    这里的HashMap代表的就是序号和牌的对应关系，表示理牌
    由于map集合定义在成员位置，在下面所有的方法中都能使用*/
    static HashMap<Integer, String> hm = new HashMap<>();
    //创建list集合表示，发牌发的是序号，根据序号再去HashMap中找对应的牌
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //装牌
        int serialNum = 1;
        for (String n : number) {
            for (String c : color) {
                hm.put(serialNum, c + n);
                list.add(serialNum);
                serialNum++;
            }
        }
        hm.put(serialNum, "小王");
        list.add(serialNum);
        serialNum++;
        hm.put(serialNum, "大王");
        list.add(serialNum);

        System.out.println(hm);
        System.out.println(list);
    }

    public PokerGame() {
        //洗牌：洗的是序号
        Collections.shuffle(list);

        /*发牌：发的是序号，拿到序号之后再去HashMap中找对应的牌
        这里用TreeSet可以实现自动理牌，即拿到手的牌是整理好的*/
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int serialNum = list.get(i);
            if (i <= 2) {
                lord.add(serialNum);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(serialNum);
            } else if (i % 3 == 1) {
                player2.add(serialNum);
            } else {
                player3.add(serialNum);
            }
        }

        lookPoker("底牌",lord);
        lookPoker("伞兵一号",player1);
        lookPoker("高进",player2);
        lookPoker("法国赌神",player3);
    }

    public void lookPoker(String name,TreeSet<Integer> ts){
        System.out.print(name+": ");
        for (int serialNum : ts) {
            String poker = hm.get(serialNum);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
