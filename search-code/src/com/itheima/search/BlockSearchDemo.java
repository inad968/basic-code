package com.itheima.search;

public class BlockSearchDemo {
    public static void main(String[] args) {
        //分块查找：块数等于数组长度开根号
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        //创建三个块的对象，三个属性表示了每一行的基本信息：最值，索引范围
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        //定义数组管理三个块的对象：这里数组的类型不是int，不是String
        Block[] blockArr = {b1, b2, b3};

        //需要查找的数据
        int num = 26;

        //调用一个方法
        int index = getIndex(blockArr, arr, num);
        System.out.println(index);
    }

    //利用分块查找的原理，查询num的索引
    private static int getIndex(Block[] blockArr, int[] arr, int num) {
        int indexBlock = findIndexBlock(blockArr, num);
        if(indexBlock == -1){
            return -1;
        }

        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    //定义方法确定num在哪一块中
    private static int findIndexBlock(Block[] blockArr, int num) {
        for (int i = 0; i < blockArr.length; i++) {
            if (num <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}


class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}