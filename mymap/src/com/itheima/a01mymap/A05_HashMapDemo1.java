package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A05_HashMapDemo1 {
    public static void main(String[] args) {

        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);
        //HashMap底层也是哈希表的结构，只计算键的哈希值，添加元素时，如果键相同，则覆盖
        //它的特点也是无序，无索引，不能重复，因为重复就会覆盖之前的值
        hm.put(s1, "山东");
        hm.put(s2, "上海");
        hm.put(s3, "广东");
        hm.put(s4, "浙江");

        Set<Student> students = hm.keySet();
        for (Student student : students) {
            String s = hm.get(student);
            System.out.println(student + "=" + s);
        }
        System.out.println("-------------------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student student = entry.getKey();
            String s = entry.getValue();
            System.out.println(student + "=" + s);
        }
        System.out.println("-------------------------");

        hm.forEach((student, string) -> System.out.println(student + "=" + string));
    }
}
