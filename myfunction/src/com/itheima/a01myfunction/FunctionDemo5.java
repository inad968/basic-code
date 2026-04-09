package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo5 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,16","张三丰,100","赵敏,16","小师妹,15","灭绝师太,99","金毛狮王,100","谢逊,101");
        //方法引用，引用构造方法
        List<Student> newList = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList);
    }
}
