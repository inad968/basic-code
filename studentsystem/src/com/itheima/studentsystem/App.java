package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("张三","123456","001","13466268028"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //    1.登录
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            boolean flag = contains(list, userName);
            if (flag) {
                System.out.println("用户名：" + userName + "未注册，请先注册");
                return;
            }
            System.out.println("请输入密码：");
            String passWord = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("验证码：" + rightCode);
                System.out.println("请输入正确的验证码：");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证成功");
                    break;
                } else {
                    System.out.println("验证码输入有误");
                }
            }

//      因为登录时我们只需要验证用户名和密码，所以我们可以利用封装的思想
//      只需创建一个仅含用户名和密码的测试对象
            User userInfo = new User(userName, passWord, null, null);
            boolean result = checkUserInfo(list, userInfo);
            if (result) {
                System.out.println("登陆成功");
//      创建对象，调用方法
//      跳转到学生管理系统
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                return;
            } else {
                System.out.println("用户名或密码有误");
                if (i == 2) {
                    System.out.println("账户已被锁定，请联系管理员");
                    return;
                } else {
                    System.out.println("还剩下" + (2 - i) + "次机会");
                }
            }
        }

    }

    //    获取验证码
    private static String getCode() {
//        创建一个集合存放大小写英文字母（库）
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
//        从库中取四次，拼接成一个验证码字符串
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());//获取随机索引
            Character c = list.get(index);//根据随机索引获取字符
            sb.append(c);//拼接字符
        }
        int num = r.nextInt(10);
        sb.append(num);
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);//根据容器的长度获取相应容器的索引，通过索引获取对应的字符
        char temp = arr[randomIndex];//数据交换
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }

    //    验证登录时用户输入的用户名和密码是否和注册时的一致
    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (userInfo.getUserName().equals(user.getUserName()) && userInfo.getPassWord().equals(user.getPassWord())) {
                return true;
            }
        }
        return false;
    }

    //    2.注册
    private static void register(ArrayList<User> list) {
//        用户录入信息
        Scanner sc = new Scanner(System.in);
//        验证用户名:输入   接收   判断
        String userName;
        while (true) {
            System.out.println("请输入用户名：");
            userName = sc.next();
//        先把输入的用户名进行格式验证：
//        1.长度在3-15之间  2.内容为：数字+字母，但不能为纯数字。
            boolean flag1 = checkUserName(userName);
            if (!flag1) {
                System.out.println("输入的用户名不符合要求，请重新输入");
                continue;
            }
//        验证用户名的唯一性
            boolean flag2 = contains(list, userName);
            if (flag2) {
                System.out.println("该用户名" + userName + "可用，用户名注册成功");
                break;
            } else {
                System.out.println("当前用户名" + userName + "已经存在，请重新输入");
            }
        }
//        验证密码：输入   接收   判断
        String passWord;
        while (true) {
            System.out.println("请输入密码：");
            passWord = sc.next();
            System.out.println("请再次输入密码：");
            String secondPassWord = sc.next();
            if (!passWord.equals(secondPassWord)) {
                System.out.println("两次密码不一致，请重新输入");
                continue;
            } else {
                System.out.println("密码设置成功！");
                break;
            }
        }
//        验证身份证号码：输入   接收   判断
        String personID;
        while (true) {
            System.out.println("请输入你的身份证号码：");
            personID = sc.next();
            boolean flag3 = checkPersonID(personID);
            if (flag3) {
                System.out.println("身份证号码录入成功");
                break;
            } else {
                System.out.println("身份证号码输入有误，请重新输入");
            }
        }
//        验证手机号：输入   接收   判断
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码：");
            phoneNumber = sc.next();
            boolean flag4 = checkPhoneNumber(phoneNumber);
            if (flag4) {
                System.out.println("手机号码录入成功");
                break;
            } else {
                System.out.println("手机号码格式有误，请重新输入");
            }
        }

//        把用户名，密码，身份证号码，手机号码放到用户对象中
        User user = new User(userName, passWord, personID, phoneNumber);
//        把用户添加到集合中，到这一步，即用户注册成功
        list.add(user);
        System.out.println("用户注册成功");
//        遍历集合
        printList(list);
    }

    //    验证注册信息是否符合系统要求
    private static boolean checkUserName(String userName) {
        int length = userName.length();
        if (length < 3 || length > 15) {
            return false;
        }

        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if (!((c > 'a' && c < 'z') || (c > 'A' && c < 'Z') || (c > '0' && c < '9'))) {
                return false;
            }
        }

        int count = 0;
        for (int i = 0; i < userName.length(); i++) {
            char c = userName.charAt(i);
            if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }

        if (phoneNumber.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkPersonID(String personID) {
//        长度是否为18位
        if (personID.length() != 18) {
            return false;
        }
//        是否以0开头
        if (personID.startsWith("0")) {
            return false;
        }
//        前十七位是否为纯数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
//        最后一位是否是数字或者x或者X
        char endChar = personID.charAt(personID.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    //    遍历注册后的数据集合
    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUserName() + "," + user.getPassWord()
                    + "," + user.getPersonID() + "," + user.getPhoneNumber());
        }
    }

    //    3.忘记密码

    private static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = sc.next();
        boolean flag = contains(list, userName);
        if (flag) {
            System.out.println("当前用户名" + userName + "未注册");
            return;
        }

        System.out.println("请输入身份证号码：");
        String personID = sc.next();
        System.out.println("请输入电话号码：");
        String phoneNumber = sc.next();

        int index = findIndex(list, userName);
        User user = list.get(index);
        if (!(personID.equalsIgnoreCase(user.getPersonID()) && phoneNumber.equals(user.getPhoneNumber()))) {
            System.out.println("输入的手机号或身份证号有误");
            return;
        }

        while (true) {
            System.out.println("请输入新的密码：");
            String passWord = sc.next();
            System.out.println("请再次输入密码：");
            String secondPassWord = sc.next();
            if(secondPassWord.equals(passWord)){
                user.setPassWord(passWord);
                System.out.println("密码修改成功！");
                break;
            }else {
                System.out.println("两次密码输入不一致");
                continue;
            }
        }

    }

    private static int findIndex(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (userName.equals(user.getUserName())) {
                return i;
            }
        }
        return -1;
    }

    //    contains或者getIndex方法
    private static boolean contains(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String userName1 = user.getUserName();
            if (userName.equals(userName1)) {
                return false;
            }
        }
        return true;
    }

}
