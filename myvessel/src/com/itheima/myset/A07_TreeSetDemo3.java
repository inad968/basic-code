package com.itheima.myset;

import java.util.TreeSet;

public class A07_TreeSetDemo3 {
    public static void main(String[] args) {
       /* 由于String类已经重写了compareTo方法，默认对字符串的首字母进行排序
        但如果我们需要对字符串的长度进行排序，我们需要TreeSet使用带参数的构造方法
        这里的参数是一个接口，所以使用匿名内部类实现接口，重写抽象方法*/
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;

        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}
