package com.itheima.a04oopextendsdemo4;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepPet(Animal a, String something) {
        if (a instanceof Dog d) {
            System.out.println(age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的狗");
            a.eat(something);
            ((Dog) a).lookHome();
        }else if(a instanceof Cat c){
            System.out.println(age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的猫");
            a.eat(something);
            ((Cat) a).catchMouse();
        }
    }
}
