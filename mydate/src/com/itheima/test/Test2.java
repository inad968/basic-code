package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //自己定义方法实现parseInt的转换
        String str = "123456789";
//        System.out.println(Integer.parseInt(str));
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("字符串格式有误");
        }else {
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                //对i1进行拼接
                int i1 = c - '0';
                num = num * 10 + i1;
            }
            System.out.println(num);
            System.out.println(num - 1);
        }
    }
}
