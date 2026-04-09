package com.itheima.a02runtimedemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJFrame extends JFrame implements ActionListener {

    JButton yesButton = new JButton("帅爆了");
    JButton justButton = new JButton("一般般吧，凑合");
    JButton noButton = new JButton("不帅，有点磕碜");


    //该按钮默认是隐藏的，点击其它按钮之后，才会出现
    JButton offButton = new JButton("饶了我吧");
    boolean flag = false;

    public MyJFrame(){

        initView();

        initJFrame();

        this.setVisible(true);
    }

    private void initView() {

        //刷新
        this.getContentPane().removeAll();

        //相当于这里有一个开关flag，控制着这个按钮的出现
        if(flag){
            offButton.setBounds(50,20,100,30);
            offButton.addActionListener(this);
            this.getContentPane().add(offButton);
        }

        JLabel text =new JLabel("你觉得自己帅吗");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);

        yesButton.setBounds(200,250,100,30);
        justButton.setBounds(200,325,100,30);
        noButton.setBounds(160,400,180,30);

        yesButton.addActionListener(this);
        justButton.addActionListener(this);
        noButton.addActionListener(this);

        this.getContentPane().add(text);
        this.getContentPane().add(yesButton);
        this.getContentPane().add(justButton);
        this.getContentPane().add(noButton);

        this.getContentPane().repaint();
    }

    private void initJFrame() {
        this.setSize(500, 600);
        this.setTitle("恶搞好基友");
        this.setAlwaysOnTop(true);
        //使界面居中
        this.setLocationRelativeTo(null);
        //关闭窗口的同时，关闭后台
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == yesButton){
            //点击后，给好基友一个弹框,并执行关机指令
            showJDialog("迷之自信，给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            //打开开关
            flag = true;
            initView();

        } else if (obj == justButton) {
            showJDialog("定位不够清晰，给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 7200");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            //打开开关
            flag = true;
            initView();

        } else if (obj == noButton) {
            showJDialog("还算有自知之明，不过还是要给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 1800");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            //打开开关
            flag = true;
            initView();

        } else if (obj == offButton) {
            showJDialog("都哥们儿，这次就饶了你吧");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public  void showJDialog(String content) {

        JDialog jDialog = new JDialog();
        jDialog.setSize(255,188);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);
    }
}
