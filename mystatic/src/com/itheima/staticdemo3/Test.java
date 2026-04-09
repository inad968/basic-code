package com.itheima.staticdemo3;

public class Test {
    public static void main(String[] args) {
//现在用scanner，以前通过args数组传递
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
