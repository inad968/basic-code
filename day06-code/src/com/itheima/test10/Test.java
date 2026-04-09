package com.itheima.test10;

public class Test {
    //    测试类中的方法需要加上static
//    解决问题的思路就是：若已经有现成的类，则调用类库中的方法。
//    如果没有，则根据需求，自己定义一个新方法，并调用新方法去解决问题
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student("崔禹真", 1, 22);
        Student s2 = new Student("秀彬", 2, 25);
        Student s3 = new Student("金载赫", 3, 23);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        Student s4 = new Student("李赫", 4, 23);
        boolean flag = contains(arr, s4.getId());
        if (flag) {
            System.out.println("学号id已经存在，请勿输入重复的id值");
        } else {
            int count = getCount(arr);
            if (count == arr.length) {
//                已经存满
//                则调用方法返回一个新数组
                Student[] newArr = createNewArr(arr);
                newArr[count] = s4;
                printArr(newArr);
            } else {
//                没有存满，请添加新的学生信息
                arr[count] = s4;
                printArr(arr);
            }
        }
        /*int index = getIndex(arr, 1);
        System.out.println("传入的数据对应的索引是：" + index);
        if (index >= 0) {
            arr[index] = null;
        } else {
            System.out.println("请输入合法的数据id!!!");
        }*/

    }

    //    方法一：目的：要求先对学号id进行判断，数组中是否已经存在该学号，是否，所以Boolean。这是先决条件
//    形参的参数需要加上数据类型
    public static boolean contains(Student[] arr, int id) {
//        对于循环，有break或者i<arr.length就可以结束循环
//        但是对于方法，需要返回值时，就需要return返回一个值
//        这就是break和return的解释
        for (int i = 0; i < arr.length; i++) {
//            arr[i]相当于弹夹，stu相当于取出来的子弹
            Student stu = arr[i];
//            *需要判空，只有有效数据才能调用方法，比如getid等
            if (stu != null) {
                int stuId = stu.getId();
                if (stuId == id) {
                    return true;
                }
            }

        }
        return false;
    }

    //    方法二：
//    目的：判断数组中已存放的元素个数count
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //    方法三：
//    目的：创建一个更大的新数组，存放老数组和下一个新的元素
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //    方法四：
//    目的：打印数组，因为有两种情况，第一种是未存满，应该输出的是老数组；否则输出新数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge() + ",学号：" + stu.getId());
            }
        }
    }

    //    方法五：
//    目的：找到对应id的索引值
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

}
