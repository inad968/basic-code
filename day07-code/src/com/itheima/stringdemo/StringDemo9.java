package com.itheima.stringdemo;

public class StringDemo9 {
    public static void main(String[] args) {
//        对字符串的操作有整体截取substring方法，和单个截取charAt方法
        String id = "312020202001018199";
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        System.out.println("人物信息：");
        System.out.println("出生年月："+year+"年"+month+"月"+day+"日");
        char gender = id.charAt(16);
//        此时，gender是字符9，要把字符9转换成整形9才能进行奇偶判断
//        查ASCII表
//        '0'--->48
//        '1'--->49
//        '2'--->50
//        '3'--->51
//        '4'--->52
//        '5'--->53
//        '6'--->54
//        '7'--->55
//        '8'--->56
//        '9'--->57
        int num = gender - 48;
//        字符在运算时会自动转换
        if (num % 2 == 0) {
            System.out.println("性别：女");
        }else {
            System.out.println("性别：男");
        }
    }
}
