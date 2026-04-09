package com.itheima.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
//    注册的业务逻辑都写在这个界面中
    public RegisterJFrame(){
        this.setSize(450,500);
        this.setTitle("拼图 注册");
        this.setAlwaysOnTop(true);
        //使界面居中
        this.setLocationRelativeTo(null);
        //关闭窗口的同时，关闭后台
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
