package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {

    JButton jButton = new JButton("别点我");
    JButton jButton1 = new JButton("点我试试");
    public MyJFrame(){
        //初始化界面
        this.setSize(603, 680);
        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        //使界面居中
        this.setLocationRelativeTo(null);
        //关闭窗口的同时，关闭后台
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);

        //初始化按钮
        //为按钮组件添加事件监听
        //即点击按钮后，触发事件，执行代码
        jButton.setBounds(0,0,100,50);
        jButton.addActionListener(this);

        jButton1.setBounds(100,0,100,50);
        jButton1.addActionListener(this);

        this.getContentPane().add(jButton);
        this.getContentPane().add(jButton1);

        this.setVisible(true);
    }

    //点击按钮后，该按钮要做出响应，也即该按钮绑定了一个功能，下面执行的代码即为功能
    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被操作的那个按钮对象
        Object source = e.getSource();
        if(source == jButton){
            jButton.setSize(200,200);
        }else if(source == jButton1){
            Random r = new Random();
            jButton1.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
