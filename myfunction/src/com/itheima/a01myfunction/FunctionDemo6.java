package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo6 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,16","张三丰,100","赵敏,16","小师妹,15","灭绝师太,99","金毛狮王,100","谢逊,101");
        //创建对象，创建数组
        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
