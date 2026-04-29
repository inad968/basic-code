package com.itheima.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {

        File src = new File("D:\\aaa.zip");
        File dest = new File("D:\\");

        unZip(src,dest);
    }

    public static void unZip(File src, File dest) throws IOException {
        //创建一个解压缩流，解压的本质：把压缩包里的文件或文件夹读取出来，按层级拷贝到目的地
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //zip中的特有读取方法，先读取压缩包里的文件或者文件夹
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            if(entry.isDirectory()){
                //表示解压的是文件夹，此时需要在指定路径创建一个同样的文件夹，即创建相同的层级
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }else {
                //表示解压的是文件，此时需要拷贝文件中的数据到指定路径
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b = zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
