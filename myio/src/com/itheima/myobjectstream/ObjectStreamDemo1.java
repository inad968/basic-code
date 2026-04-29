package com.itheima.myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {

        Student stu = new Student("zhangsan",23,"芜湖");
        //序列化流：字节流的高级流，可以将对象写进本地文件中，前提是JavaBean类必须实现序列化接口
        //相当于游戏里的存档
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\f.txt"));
        oos.writeObject(stu);
        oos.close();
    }
}
