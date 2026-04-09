package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user1 = new User("小李", "123456", 0);
        User user2 = new User("小宋", "123456", 1);
        User user3 = new User("小罗", "123456", 2);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入id：");
            int i = sc.nextInt();
            boolean flag = findInfo(list, i);
            if (flag) {
                System.out.println(list.get(i).getId() + "," + list.get(i).getUsername() +
                        "," + list.get(i).getPassword());
                break;
            } else {
                System.out.println("id有误。");
            }
        }
    }

    public static boolean findInfo(ArrayList<User> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                return true;
            }
        }
        return false;
    }
}
