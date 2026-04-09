package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "张三丰-100", "赵敏-16", "小师妹-14", "灭绝师太-99", "金毛狮王-100");

        //需求：只获取字符串中的年龄，并进行打印。所以我们用map方法，转换流中的数据类型

        /*Function<String, Object>的泛型中有两个数据类型，第一个表示流中原本的数据类型
         * 第二个表示要转换成什么数据类型.还有接口的方法中，需要修改它的返回值类型，改成
         * 第二个参数对应的类型*/
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                //也可以用截取subString，但是这里字符串的长度不固定，而且格式特殊
                //所以我们用字符串的另一个方法split。把"张无忌-15"变成"张无忌","15"
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.print(s + " "));

        System.out.println();
        //这里的方法体中只有一行，所以可以省略return
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.print(s + " "));
    }
}
