package com.itheima.a04regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "905797584";
//        System.out.println(checkQQ(qq));

        //第二种方法：使用正则表达式
        //正则表达式表示字符串的规则和格式
        //[]表示第一位非0；“\\d”表示后面的数据是数字；{}表示后面的位数范围
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }

    public static boolean checkQQ(String qq) {
        //在字符串中，length()是方法，不是属性
        int length = qq.length();
        if (length < 6 || length > 20) {
            return false;
        }

        if (qq.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            //charAt()方法遍历字符串，以字符的形式取出字符串中的每一位
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
