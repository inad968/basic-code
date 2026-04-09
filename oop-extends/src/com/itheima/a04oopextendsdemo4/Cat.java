package com.itheima.a04oopextendsdemo4;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的小猫享受的吃着" + something);
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
