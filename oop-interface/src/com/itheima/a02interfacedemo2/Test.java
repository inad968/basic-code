package com.itheima.a02interfacedemo2;

public class Test {
    public static void main(String[] args) {
        PingPongSporter pps = new PingPongSporter("马龙",29);
        System.out.println(pps.getName()+", "+pps.getAge());
        pps.speakEnglish();
        pps.study();
    }
}
