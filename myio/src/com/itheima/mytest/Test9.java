package com.itheima.mytest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*由于集合的底层也实现了Serializable接口，并固定了序列号，所以当要对多个对象进行序列化时，
        我们可以创建一个集合，将创建的对象存储到集合中，实现对多个对象进行操作*/
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio\\g.txt"));

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student student : list) {
            System.out.println(student);
        }

        ois.close();
    }
}
