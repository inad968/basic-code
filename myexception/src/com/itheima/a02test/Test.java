package com.itheima.a02test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //要求：对象的姓名字段的长度在3-10之间
        //      对象的年龄在18-30之间
        Scanner sc = new Scanner(System.in);
        GirlFriend gf = new GirlFriend();

        while (true) {
            try {
                System.out.println("请输入你心仪对象的姓名：");
                String name = sc.nextLine();
                //如果符合校验规则，则将姓名赋值给成员变量
                //若不符合校验规则，方法抛出异常，此时会跳出try方法体
                gf.setName(name);

                System.out.println("请输入你心仪对象的年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                //循环结束的标志，说明赋值成功
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字！");
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }

        }
        System.out.println(gf);
    }
}
