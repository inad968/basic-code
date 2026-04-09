package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

//        菜单页面的搭建
public class StudentSystem {
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
//        可以用标签给循环命名
//        即这个循环叫做loop
        loop:
        while (true) {
            System.out.println("--------------------欢迎来到学生管理系统---------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输出您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
//            当用户输入1时，系统调用相应的方法，我们在方法里完成相应的功能
            switch (choose) {
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUERY_STUDENT -> queryStudent(list);
                case EXIT -> {
                    System.out.println("退出");
                    break loop;
//             指定结束loop循环
//             或者使用System.exit(0);  停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //    四个功能即四个方法，下面完成四个功能的实现。
    //    我们需要创建一个集合/数据库来存放数据，来实现对集合/数据库的增删改查


    //    添加学生
    public static void addStudent(ArrayList<Student> list) {
        Student student = new Student();

        Scanner sc = new Scanner(System.in);
//        id是主键，唯一性
        while (true) {
            System.out.println("请输入学生的id：");
            String id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("当前ID已经存在，请重新输入");
            } else {
                student.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        student.setName(name);

        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        student.setAge(age);

        System.out.println("请输入学生的家庭地址：");
        String address = sc.next();
        student.setAddress(address);

        list.add(student);
        System.out.println("学生信息添加成功");

    }

    //    删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的ID：");
        String id = sc.next();
//        通过ID获取索引，通过索引删除元素
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为：" + id + "的学生删除成功");
        } else {
            System.out.println("id不存在，请重新输入");
        }
    }

    //    修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生ID：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("要修改的ID：" + id + "不存在，请重新输入");
            return;
        }

        Student student = list.get(index);

        System.out.println("请输入要修改的学生姓名：");
        String newName = sc.next();
        student.setName(newName);

        System.out.println("请输入要修改的学生年龄：");
        int newAge = sc.nextInt();
        student.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址：");
        String newAddress = sc.next();
        student.setAddress(newAddress);

        System.out.println("学生信息修改成功");
    }

    //    查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
//        打印表头
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {
      /*  for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sId = s.getId();
            if(id.equals(sId)){
                return true;
            }
        }
        return false;*/
        int index = getIndex(list, id);
        return index >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sId = s.getId();
            if (id.equals(sId)) {
                return i;
            }
        }
        return -1;
    }
}

