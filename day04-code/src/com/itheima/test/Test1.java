package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        compare((long) 10, (long) 20);
    }

    public static void compare(byte b1, byte b2) {
        System.out.println("byte");
        System.out.println(b1 == b2);
    }
    public static void compare(short s1, short s2) {
        System.out.println("short");
        System.out.println(s1 == s2);
    }

    public static void compare(int i1, int i2) {
        System.out.println("int");
        System.out.println(i1 == i2);
    }
    public static void compare(long n1, long n2) {
        System.out.println("long");
        System.out.println(n1 == n2);
    }
}
