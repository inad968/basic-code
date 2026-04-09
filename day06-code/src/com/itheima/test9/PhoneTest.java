package com.itheima.test9;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone phone1 = new Phone("苹果", 9000, "橙色");
        Phone phone2 = new Phone("华为", 8000, "白色");
        Phone phone3 = new Phone("三星", 7000, "绿色");
        arr[0] = phone1;
        arr[1] = phone2;
        arr[2] = phone3;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        System.out.println("三部手机的总价格为：" + sum);
        double avg = sum / arr.length;
        System.out.println("手机的平均价格为：" + avg);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            if (phone.getPrice() < avg) {
                count++;
                System.out.println("低于平均价格的是：" + phone.getName() + "，价格为："
                        + phone.getPrice() + "，颜色为：" + phone.getColor());
            }
        }
        System.out.println("低于平均价格的品牌数是：" + count);
    }
}
