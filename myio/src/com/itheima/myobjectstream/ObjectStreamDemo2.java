package com.itheima.myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //反序列化流：对象操作输入流,将对象读取到内存中。比如游戏里的读档
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio\\f.txt"));

        Object o = ois.readObject();
        System.out.println(o);

        ois.close();
    }
}
