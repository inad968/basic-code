package com.itheima.myhutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        /*1.根据可变参数创建一个file对象:string...names
        File file = new File();
        相对于上面的这个方法更灵活。*/
        File file = FileUtil.file("D:\\", "bbb", "ccc", "a.txt");
        System.out.println(file);

        /*2.根据参数创建文件，如果父级路径不存在，它会自动帮我们创建父级路径。
        File f = new File("b.txt");
        f.createNewFile();
        而上面的这个方法如果父级路径不存在，则会报错*/
        File touch = FileUtil.touch(file);
        System.out.println(touch);

        /*3.把集合中的数据写出到文件中，以覆盖的方式，也就是把数据以集合的形式写到文件中*/
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");

        File file1 = FileUtil.writeLines(list, "D:\\a.txt", "UTF-8");
        System.out.println(file1);

       /*4.把文件中的数据读取到一个集合中*/
        List<String> list1 = FileUtil.readLines("D:\\a.txt", "UTF-8");
        System.out.println(list1);
    }
}
