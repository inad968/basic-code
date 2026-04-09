package com.itheima.innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        Outer.inter oi = new Outer().new inter();
        oi.show();
    }
}
