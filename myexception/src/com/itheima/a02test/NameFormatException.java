package com.itheima.a02test;

public class NameFormatException extends RuntimeException{
    //自定义异常类，需要继承运行时异常或者编译时异常
    //如果是与调用方法，参数错误而导致的异常，就继承运行时异常

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        //这里的形参表示报错的信息
        //可以自定义报错信息
        super(message);
    }
}
