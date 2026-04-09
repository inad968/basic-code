package com.itheima.a02test;

public class AgeOutOfBoundsException extends RuntimeException{
    //自定义异常类
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        //这里的形参表示报错的信息
        //可以自定义报错信息
        super(message);
    }
}
