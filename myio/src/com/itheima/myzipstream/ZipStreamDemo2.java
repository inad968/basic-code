package com.itheima.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //表示把a.txt压缩到D盘中
        File src = new File("D:\\a.txt");
        File dest = new File("D:\\");
        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        //创建压缩流
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        //将要压缩的文件变成entry对象,这里的参数表示压缩包里面的路径，可以在压缩包里创建子文件夹
        ZipEntry entry = new ZipEntry("a.txt");
        //把entry对象放进压缩流中，此时文件就变成了压缩形式
        zos.putNextEntry(entry);

        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
