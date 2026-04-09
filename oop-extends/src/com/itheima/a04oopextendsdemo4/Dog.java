package com.itheima.a04oopextendsdemo4;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗，大口大口的吃着" + something);
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
