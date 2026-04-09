package com.itheima.innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String color;
    public void show(){
        System.out.println(carName);
        Engine e = new Engine();
        e.engineName = "V8";
        System.out.println(e.engineName);
    }

    class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
