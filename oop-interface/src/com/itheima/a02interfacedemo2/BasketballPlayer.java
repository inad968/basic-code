package com.itheima.a02interfacedemo2;

public class BasketballPlayer extends Sporter{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }
}
