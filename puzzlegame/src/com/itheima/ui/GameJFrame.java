package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //    跟游戏相关的业务逻辑都写在这个类中
    int[][] data = new int[4][4];

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    String path = "puzzlegame\\image\\game\\";

    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    int step = 0;

    //创建选项下面的条目
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");
    JMenuItem nbaPlayer = new JMenuItem("球星");
    JMenuItem model = new JMenuItem("模特");
    JMenuItem superCar = new JMenuItem("跑车");

    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        //根据初始化数组初始化图片
        initImage();

        //显示界面
        this.setVisible(true);
    }

    //实现将图片打乱的效果
    //即获取一个二维数组容器，将0-15打乱后装入其中
    private void initData() {
        //1.定义一个一维数组,对应15张图片
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //2.打乱一维数组组
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        //3.将打乱后一维数组中的值赋值给一个二维数组
        //二维数组对应4*4的整张图片
        int num = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (arr[num] == 0) {
                    x = j;
                    y = i;
                }
                data[j][i] = arr[num];
                num++;
            }
        }
    }

    //添加图片
    //从二维数组容器中获得将要添加的图片的序号
    //从而实现打乱的效果
    private void initImage() {
        //每按一次方向键，二维数组都会刷新
        //它就会重新根据新的二维数组加载新图片
        //所以要remove之前的图片
        //按方向键还原拼图的过程就相当于还原魔方的过程
        //当上两个数组相等时，就win
        this.getContentPane().removeAll();

        //调用victory方法，查看是否成功，成功则加载win图片，否则继续执行下面的代码
        if (victory()) {
            JLabel win = new JLabel(new ImageIcon("puzzlegame\\image\\victory.png"));
            win.setBounds(203, 283, 197, 73);
            this.getContentPane().add(win);
        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //在二维数组容器中获取num
                int num = data[i][j];
                //创建一个JLabel对象管理图片，想当于一个图片容器
                JLabel jLabel = new JLabel(new ImageIcon(path + "piece_" + num + ".png"));

                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));

                //把图片容器添加到界面中
                //界面有一个隐藏容器pane,需要调用添加
                this.getContentPane().add(jLabel);
            }

        }

        //添加背景图片
        ImageIcon bc = new ImageIcon("puzzlegame\\image\\image1.png");
        JLabel background = new JLabel(bc);
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();

    }

    //初始化菜单
    private void initJMenuBar() {
        //创建菜单
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changeImage = new JMenu("更换图片");


        //将选项下面的条目添加到选项中
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        changeImage.add(nbaPlayer);
        changeImage.add(model);
        changeImage.add(superCar);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        
        nbaPlayer.addActionListener(this);
        model.addActionListener(this);
        superCar.addActionListener(this);

        //将选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给界面添加菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        //使界面居中
        this.setLocationRelativeTo(null);
        //关闭窗口的同时，关闭后台
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);

    }

    //按按键时会调用以下三个重写的方法
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按住按键不松时调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        //按A绑定该方法
        //表示查看完整图片
        int code = e.getKeyCode();
        if (code == 65) {

            this.getContentPane().removeAll();

            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame\\image\\game\\image.png"));
            jLabel.setBounds(83, 134, 420, 420);
            this.getContentPane().add(jLabel);

            ImageIcon bc = new ImageIcon("puzzlegame\\image\\image1.png");
            JLabel background = new JLabel(bc);
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();
        }
    }

    //按键松开后调用这个方法
    @Override
    public void keyReleased(KeyEvent e) {
        //如果成功还原，则直接退出该方法，不能继续移动图片
        if (victory()) {
            return;
        }
        //这里的x,y表示的是第几行、第几列
        /* (0,0)(0,1)(0,2)(0,3)
           (1,0)(1,1)(1,2)(1,3)
           (2,0)(2,1)(2,2)(2,3)
           (3,0)(3,1)(3,2)(3,3)  */
        //而上面添加图片是按照坐标举行的
        /* (0,0)(1,0)(2,0)(3,0)
           (0,1)(1,1)(2,1)(3,1)
           (0,2)(1,2)(2,2)(3,2)
           (0,3)(1,3)(2,3)(3,3) */
        //对上、下、左、右进行判断
        //对索引越界进行判断
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 3) {
                return;
            }
            //向左移动
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            //调用方法按照最新的二维数组加载图片
            initImage();
        } else if (code == 38) {
            if (x == 3) {
                return;
            }
            //向上移动
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            //调用方法按照最新的二维数组加载图片
            initImage();
        } else if (code == 39) {
            //向右移动
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            //调用方法按照最新的二维数组加载图片
            initImage();
        } else if (code == 40) {
            if (x == 0) {
                return;
            }
            //向下移动
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            //调用方法按照最新的二维数组加载图片
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            //因为data是在成员位置定义的
            //这里是在刷新二维数组
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j])
                    return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的条目对象
        Object obj = e.getSource();
        if(obj == replayItem){
            //重新生成一个二维数组
            initData();
            //重新计数
            step = 0;
            //根据initData()重新加载图片
            initImage();
        } else if (obj == reLoginItem) {
            //即关闭游戏界面，进入登录界面
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeItem) {
            System.exit(0);
        } else if (obj == accountItem) {
            //设置弹框，弹框是一个单独的界面，需要把图片容器add到弹框中
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame\\image\\weChat.png"));
            jLabel.setBounds(0,0,291,283);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }
}
