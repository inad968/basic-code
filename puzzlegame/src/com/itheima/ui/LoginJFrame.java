package com.itheima.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginJFrame extends JFrame implements MouseListener {
    //登录的相关业务逻辑都写在这个类中
    //创建一个集合用来存储用户对象，相当于一个数据库
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("李四","123456"));
        list.add(new User("张三","123"));
    }

    JButton login = new JButton();
    JButton register = new JButton();
    String code = CodeUtil.getCode();
    public LoginJFrame(){

        initView();

        initJFrame();

    }

    private void initView() {

        //用户名
        JLabel usernameText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\userName.png"));
        usernameText.setBounds(116,135,54,23);
        this.getContentPane().add(usernameText);

        //用户名文本输入框
        JTextField username = new JTextField();
        username.setBounds(195,134,200,30);
        this.getContentPane().add(username);

        //密码
        JLabel passwordText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\passWord.png"));
        passwordText.setBounds(130,195,37,18);
        this.getContentPane().add(passwordText);

        //密码输入框
        JPasswordField password = new JPasswordField();
        password.setBounds(195,195,200,30);
        this.getContentPane().add(password);

        //验证码
        JLabel randomCode = new JLabel(new ImageIcon("puzzlegame\\image\\login\\randomCode.png"));
        randomCode.setBounds(133,256,57,18);
        this.getContentPane().add(randomCode);

        //验证码输入框
        JTextField randomText = new JTextField();
        randomText.setBounds(195,256,100,30);
        this.getContentPane().add(randomText);

        //验证码提示框
        JLabel rightCode = new JLabel();
        rightCode.setText(code);
        rightCode.setBounds(300,256,50,30);
        this.getContentPane().add(rightCode);

        //添加登录按钮
        login.setBounds(123,310,87,28);
        login.addMouseListener(this);
        //为按钮设置背景图片
        login.setIcon(new ImageIcon("puzzlegame\\image\\login\\login1.png"));
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //添加注册按钮
        register.setBounds(256,310,92,29);
        register.addMouseListener(this);
        //为按钮设置背景图片
        register.setIcon(new ImageIcon("puzzlegame\\image\\login\\reg1.png"));
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\image1.png"));
        background.setBounds(0,0,508,560);
        this.getContentPane().add(background);

    }

    private void initJFrame() {
        this.setSize(455,430);
        this.setTitle("拼图 登录");
        this.setAlwaysOnTop(true);
        //使界面居中
        this.setLocationRelativeTo(null);
        //关闭窗口的同时，关闭后台
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void showJDialog(String content){
        JDialog jDialog = new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        if(source == login){
            login.setIcon(new ImageIcon("puzzlegame\\image\\login\\login2.png"));
        } else if (source == register) {
            register.setIcon(new ImageIcon("puzzlegame\\image\\login\\reg2.png"));
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        Scanner sc = new Scanner(System.in);
        if(source == login){
            login.setIcon(new ImageIcon("puzzlegame\\image\\login\\login1.png"));
            /*String inputCode = sc.next();
            if(!inputCode.equals(code)){
                showJDialog("验证码输入有误");
                CodeUtil.getCode();
            }*/
        } else if (source == register) {
            register.setIcon(new ImageIcon("puzzlegame\\image\\login\\reg1.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
