package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张三丰","赵敏","小师妹","灭绝师太","金毛狮王","谢逊");
        //引用本类的成员方法,通过this::方法。但是静态方法中是没有this的
        list.stream().filter(new FunctionDemo4()::stringJudge)
                .forEach(s -> System.out.println(s));
    }
    public boolean stringJudge(String s){
        return s.startsWith("张") && s.length() == 3;
    }
}
