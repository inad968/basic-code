package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {

        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("zhangSan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangWu",25);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("zhangSan",23);
        //此时没有重写object的equals方法，比较的是地址值，所以需要在JavaBean中重写equals方法
        //重写后，比较的就是属性值
        System.out.println(coll.contains(s4));
    }
}
