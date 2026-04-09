package com.itheima.test10;

public class Test1 {
    public static void main(String[] args) {
//        通过id删除学生信息
        Student[] arr = new Student[3];
        Student s1 = new Student("崔禹真", 1, 22);
        Student s2 = new Student("秀彬", 2, 25);
        Student s3 = new Student("金载赫", 3, 23);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
         int index = getIndex(arr, 2);
        System.out.println("传入的数据对应的索引是：" + index);
        if (index >= 0) {
            arr[index] = null;
        } else {
            System.out.println("请输入合法的数据id!!!");
        }
        printArr(arr);
    }
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int stuId = stu.getId();
                if (stuId == id) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge() + ",学号：" + stu.getId());
            }
        }
    }
}
