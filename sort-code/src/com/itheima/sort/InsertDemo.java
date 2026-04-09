package com.itheima.sort;

public class InsertDemo {
    public static void main(String[] args) {

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //利用插入排序进行排序：找到一个分界点，左边是有序的，右边是无序的
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        //遍历从startIndex开始到最后一个元素，依次插入到前面的有序队列
        //从后往前，比较，再插入，
        for (int i = startIndex; i < arr.length; i++) {
            //记录当前要插入的索引
            int j = i;
            //也是循环的嵌套，但这里是while
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
