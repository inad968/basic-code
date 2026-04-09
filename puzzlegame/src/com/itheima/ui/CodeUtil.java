package com.itheima.ui;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            Character c = list.get(index);
            sb.append(c);
        }
        int num = r.nextInt(10);
        sb.append(num);

        char[] array = sb.toString().toCharArray();
        int randomIndex = r.nextInt(array.length);
        char temp = array[randomIndex];
        array[randomIndex] = array[array.length - 1];
        array[array.length - 1] = temp;

        return new String(array);
    }
}
