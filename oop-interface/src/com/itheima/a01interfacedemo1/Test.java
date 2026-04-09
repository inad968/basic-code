package com.itheima.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
//        构造方法：对对象进行初始化，带参数则完善了该对象的信息，没带参数，则该对象的信息还没完善
//        抽象类、接口是不能实例化的
        Dog g = new Dog("小黄",2);
        System.out.println(g.getName()+", "+g.getAge());
        g.eat();
        g.swim();
    }
}
