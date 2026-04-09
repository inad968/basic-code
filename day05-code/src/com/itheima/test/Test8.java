package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
//        奖池生成中奖号码
        int[] arr = createNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
//        用户输入彩票号码
        int[] userInputArr = userInputNumber();
      /*  for (int i = 0; i < userInputArr.length; i++) {
            System.out.print(userInputArr[i] + " ");
        }*/
//        判断用户的中奖情况
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    break;

                }
            }
        }
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }
//        System.out.println("您猜中了" + redCount + "个红球，猜中了" + blueCount + "个蓝球");
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万元");

        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500万元");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖2000元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖100元");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖10元");
        }else {
            System.out.println("谢谢参与");
        }
    }

    public static int[] userInputNumber() {
//        用户输入红色号码
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("输入的红球号码已经存在，请重新输入");
                }

            } else {
                System.out.println("输入的红球号码不合法，请重新输入");
            }
        }
//        用户输入蓝色号码
        System.out.println("请输入蓝球号码");
        int blueNumber = sc.nextInt();
        while (true) {
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝球号码不合法,请重新输入");
                blueNumber = sc.nextInt();
            }
        }
        return arr;
    }

    public static int[] createNumber() {
        int[] arr = new int[7];
        Random r = new Random();
//        生成红球号码
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
//        生成蓝球号码
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    public static boolean contains(int[] arr, int number) {
//        判断数组中是否包含指定数字,红球数字不能重复
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;

    }
}
