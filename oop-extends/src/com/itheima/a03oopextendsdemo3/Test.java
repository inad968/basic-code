package com.itheima.a03oopextendsdemo3;

public class Test {
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        admin.setName("管理员");
        admin.setAge(30);

        Teacher t = new Teacher();
        t.setName("李梅");
        t.setAge(27);

        Student s = new Student();
        s.setName("王刚");
        s.setAge(20);

        register(admin);
        register(t);
        register(s);

    }

    //    这个方法既能接收老师，又能接收学生，还能接收管理员的信息
    public static void register(Person p) {
        p.show();
    }
}
