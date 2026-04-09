package com.itheima.test3;

public class UserTest {
    public static void main(String[] args) {
        User user = new User(22, "张三", "123456", "123@qq.com", "男");
        System.out.println("年龄：" + user.getAge());
        System.out.println("用户名：" + user.getUsername());
        System.out.println("密码：" + user.getPassword());
        System.out.println("邮箱：" + user.getEmail());
        System.out.println("性别：" + user.getGender());
    }
}
