package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "李白", "白居易", "杜甫", "苏轼", "王安石", "张三丰", "曹操");

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length() == 3;
            }
        }).forEach(s -> System.out.print(s + " "));
        System.out.println();
        //引用其他类的成员方法：对象::方法
        list.stream().filter(new StringOperation()::stringJudge)
                .forEach(s -> System.out.print(s + " "));
    }
}
