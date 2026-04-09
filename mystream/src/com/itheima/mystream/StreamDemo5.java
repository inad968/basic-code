package com.itheima.mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {

        //使用stream接口中的静态方法
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
    }
}
