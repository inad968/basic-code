package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {

        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:11:0";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        long startDateTime = startDate.getTime();
        long endDateTime = endDate.getTime();
        long orderDateTime = orderDate.getTime();

        if (orderDateTime >= startDateTime && orderDateTime <= endDateTime) {
            System.out.println("参加秒杀活动成功");
        }else {
            System.out.println("活动已失效");
        }
    }
}
