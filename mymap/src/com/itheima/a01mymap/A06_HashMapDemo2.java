package com.itheima.a01mymap;

import java.util.*;

public class A06_HashMapDemo2 {
    public static void main(String[] args) {
        /*题目需求：现有A\B\C\D四个景点。供80名学生选择，
        要求打印出投票最高的景点。此时涉及到多个元素的计数。
        所以我们可以利用HashMap，键为景点，值为投票次数。利用这个键值对的思想*/

        //用数组存储四个景点；用集合存储80名同学投票的结果
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();

        //模拟投票
        //下面的两个索引：i表示第几名同学；index表示只能从0、1、2、3，也即A\B\C\D中选择景点
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //这里创建HashMap集合，此时键是确定的表示每一个景点
        //但是值是变化的，表示投票的次数，所以我们通过遍历list集合，将次数添加到HashMap中
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            if (hm.containsKey(name)) {
                //表示如果存在，则取出次数，使其加一，再重新添加，覆盖原来的次数
                Integer count = hm.get(name);
                count++;
                hm.put(name, count);
            } else {
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        //现在来统计最高的票数,找到max的值，max此时是临时变量
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);

        //再根据max的值，找到最受欢迎的景点
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            if(count == max){
                System.out.println(entry.getKey());
            }
        }
    }
}
