package com.itheima.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //表示把aaa文件夹压缩到本盘符下的.zip压缩包中
        //关键：压缩包的父级路径是src.getName()，即aaa,文件或文件夹都要放在该层级的下面(aaa+"\\"+file.getName())
        //压缩的步骤：1.将文件变成ZipEntry对象 2.把entry对象通过压缩流放到压缩包当中 3.拷贝数据
        File src = new File("D:\\aaa");
        File destParent = src.getParentFile();
        File dest = new File(destParent, src.getName() + ".zip");

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //第三个参数是压缩包内部的路径，要和第一个参数保持一致，也即层级结构是一样的
        toZip(src, zos, src.getName());
        zos.close();
    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        //表示要把数据源通过压缩流变成压缩包，压缩包里面的层级路径和数据源相同
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            } else {
                toZip(file,zos,name+"\\"+file.getName());
            }
        }
    }
}
