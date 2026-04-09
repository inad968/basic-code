package com.itheima.a01myexception;

public class ExceptionDemo3 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);
            System.out.println(2/0);
            String str = null;
            System.out.println(str.equals("abc"));
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("出现异常");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("打印异常");
        }
    }
}
