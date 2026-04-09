package com.itheima.innerclassdemo3;

public class Test {
    public static void main(String[] args) {
//        如果出现一个类只有一次，则不需单独写一个类来实例化
//        如下：我们直接使用匿名内部类对象
        new Swim(){

            @Override
            public void swim() {
                System.out.println("游泳");
            }
        };

        new Animal(){

            @Override
            public void eat() {
                System.out.println("吃莽莽");
            }
        };
        method(

                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("吃莽莽");
                    }
                }

        );
    }

    public static void method(Animal a) {
        a.eat();
    }
}
