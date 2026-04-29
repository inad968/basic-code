package com.itheima.mycommonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        //在模块下新建lib文件夹，把需要的第三方工具包jar放在里面，添加为库，即可调用第三方API

        File src = new File("myio\\a.txt");
        File dest = new File("myio\\copy.txt");
        FileUtils.copyFile(src,dest);
    }
}
