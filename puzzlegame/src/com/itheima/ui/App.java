package com.itheima.ui;

public class App {
//    程序的启动入口
    public static void main(String[] args) {
//        需要哪一个功能，哪一个界面就创建哪一个对象

        new LoginJFrame();//创建了一个登录界面
        new RegisterJFrame();//创建了一个注册界面
        new GameJFrame();//创建了一个游戏主界面
    }
}
