package com.itheima.a04oopextendsdemo4;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(23,"听安");
        Animal a1 = new Dog(2,"黄");
        p1.keepPet(a1,"骨头");

        Person p2 = new Person(25,"清风");
        Animal a2 = new Cat(1,"黑白相间");
        p2.keepPet(a2,"猫粮");
    }
}
