package com.itheima.a01myfile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo4 {
    public static void main(String[] args) {

        File f = new File("D:\\aaa");

        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //第一个参数表示父级路径，即D:\aaa，第二个参数表示子级路径
                //合在一起就表示，D:\aaa这个文件夹下的某一个文件或文件夹
                System.out.println(dir);
                System.out.println(name);
                File src = new File(dir, name);
                //过滤：将符合下面条件的路径放到一个集合中
                return src.isFile() && src.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files));
    }
}
