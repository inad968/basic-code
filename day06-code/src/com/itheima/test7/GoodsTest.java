package com.itheima.test7;

public class GoodsTest {
    public static void main(String[] args) {
//        对象数组，类名[] 数组名 = new 类名[数组长度];存放对象的数组
//        数据类型是引用数据类型，不是基本数据类型
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("手机", 1999.0, 100, "A001");
        Goods g2 = new Goods("电脑", 4999.0, 50, "A002");
        Goods g3 = new Goods("平板", 2999.0, 80, "A003");
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println("商品名称：" + goods.getName() + "，价格："
                    + goods.getPrice() + "，数量：" + goods.getCount() + "，编号：" + goods.getId());
        }
    }
}
