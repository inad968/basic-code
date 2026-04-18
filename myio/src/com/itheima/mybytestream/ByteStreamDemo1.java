package com.itheima.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        fos.write(97);
        fos.close();
    }
}
