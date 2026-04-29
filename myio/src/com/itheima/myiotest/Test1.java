package com.itheima.myiotest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {

        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?from=aladdin&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&smp_names=termBrand2%2Cpoem1";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据，把网址上所有的数据拼接成一个字符串
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //3.通过正则表达式，把数据进行筛选，把符合要求的数据获取出来
        ArrayList<String> familyNameTempList = getData(familyNameStr, "(\\W{4})(，|。)", 1);
        System.out.println(familyNameTempList);
    }

    private static ArrayList<String> getData(String str, String regex, int index) {
        //1.创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        //2.获取正则表达式的对象
        Pattern pattern = Pattern.compile(regex);
        //3.按照正则表达式的规则，筛选字符串中的数据，返回一个文本匹配器的对象
        Matcher matcher = pattern.matcher(str);
        //4.对正则表达式进行分组，只获取符合第一组的数据
        while (matcher.find()){
            list.add(matcher.group(index));
        }
        return list;
    }

    public static String webCrawler(String net) throws IOException {
        //1.定义string builder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个URL对象,即把字符串变成了网址对象
        URL url = new URL(net);
        //3.连接上这个网址
        URLConnection conn = url.openConnection();
        //4.爬取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        //5.释放资源
        isr.close();
        //6.把读取到的数据返回
        return sb.toString();
    }
}
