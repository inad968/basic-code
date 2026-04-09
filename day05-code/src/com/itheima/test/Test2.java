package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        输入6位评委的打分,去掉一个最高分,去掉一个最低分,计算平均分
//        for循环中i++的位置是灵活的,该i++的位置可以保证，在输入错误时索引不变
        int[] scoreArr = getScore();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println("第" + (i + 1) + "位评委的打分是:" + scoreArr[i]);
        }
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        int avg = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("去掉最高分:" + max + ",去掉最低分:" + min + ",平均分是:" + avg);
    }

    public static int[] getScore() {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分:");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("输入有误,请重新输入第" + (i + 1) + "位评委的打分:");
            }
        }
        return scores;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }
}
