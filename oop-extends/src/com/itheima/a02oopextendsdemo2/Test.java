package com.itheima.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
//        创建对象并赋值调用
//        第一种赋值方式:带参数的构造方法
        Manager m = new Manager("001", "张三", 8000, 2000);
        System.out.println(m.getId() + ", " + m.getName() + ", "
                + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();
//        第二种赋值方式：set方法
        Cook c = new Cook();
        c.setId("002");
        c.setName("李四");
        c.setSalary(6000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}
