package com.itheima.immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {

        /*对于Map集合，在调用of方法时，最多只能传入10对数据
         * 因为，在参数列表中只能写一个可变参数，不能同时让K,V
         * 成为可变参数。所以当数据超过10对时，我们可以使用ofEntries方法
         * 这个方法的底层逻辑是：因为of()方法、ofEntries()方法，传入的都是
         * 可变参数，而可变参数的底层是一个数组。所以我们可以用entrySet方法
         * 把键值对存入单列集合，再把单列集合变成一个数组。再把这个数组
         * 传递给ofEntries()。此时就可以实现把一个任意长度的集合变成一个
         * 不可变集合
         * */

        HashMap<String, String> hm = new HashMap<>();

        hm.put("张三", "天津");
        hm.put("李四", "武汉");
        hm.put("王五", "合肥");
        hm.put("赵六", "济南");
        hm.put("钱七", "青海");

        Set<Map.Entry<String, String>> entries = hm.entrySet();

       /* toArray()方法，里面的参数是数组。所以我们要指定该数组的类型，
         即把entries集合变成什么类型的数组
        所以这里创建数组，数组里存放的是entry对象*/
        Map.Entry[] arr1 = new Map.Entry[0];
        Map.Entry[] arr2 = entries.toArray(arr1);

        Map map = Map.ofEntries(arr2);
        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
