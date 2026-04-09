package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo6 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张无忌","张三丰","赵敏","小师妹","灭绝师太","金毛狮王","谢逊");

        list.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println();
        list.stream().skip(3).forEach(s -> System.out.println(s));
        System.out.println();
        list.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
    }
}
