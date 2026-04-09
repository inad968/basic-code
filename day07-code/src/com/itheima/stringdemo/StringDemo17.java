package com.itheima.stringdemo;

public class StringDemo17 {
    public static void main(String[] args) {
        String num1 = "12345";
        String num2 = "684529";
        int number1 = stringToInt(num1);
        int number2 = stringToInt(num2);
        System.out.println(number1);
        System.out.println(number2);
        int x1 = number1;
        for (int i = 0; i < 5; i++) {
            if (x1 > 0) {
                int ge = x1 % 10;
                System.out.println(ge);
                x1 = x1 / 10;
            }
        }
    }
//    把字符串类型的数字变成一个整型
//    把一个整数的每一位取出来
//    也可以把每一个数拼成一个整数
        public static int stringToInt (String str){
            int result = 0;
            int num;
            int count = 1;
            for (int i = str.length() - 1; i >= 0; i--) {
                char c = str.charAt(i);
                num = c - 48;
                result = (num * count) + result;
                count = count * 10;
            }
            return result;
        }

}


