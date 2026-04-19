package com.itheima.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("myio\\a.txt");
        String str = "nishiwuyanzuma";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
