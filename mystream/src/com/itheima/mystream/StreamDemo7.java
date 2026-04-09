package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","张无忌","张无忌","张三丰","赵敏","小师妹","灭绝师太","金毛狮王","谢逊");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"少林","武当","太极");

        //去重
        list1.stream().distinct().forEach(s -> System.out.println(s));

        //合并:合并两个流
        Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));
    }
}
