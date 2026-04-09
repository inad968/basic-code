package com.itheima.a01myexception;

public class ExceptionDemo4 {
    public static void main(String[] args) {

        int[] arr = {};
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(max);
    }
    public static int getMax(int[] arr)throws NullPointerException,ArrayIndexOutOfBoundsException{
        //方法的作用就是接收参数，返回相应的结果
        //但是传入的参数可能发生异常，所以需要对传入的参数进行判断，过滤
        //如果发生异常，就抛出异常，并结束方法
        if(arr == null){
            throw new NullPointerException();
        }
        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
