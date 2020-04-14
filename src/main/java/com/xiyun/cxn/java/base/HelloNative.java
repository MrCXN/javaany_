package com.xiyun.cxn.java.base;

/**
 * @program javaany_
 * @description: HelloNative
 * @author: cxn
 * @create: 2020/04/13 11:18
 */
public class HelloNative {

    static
    {
        System.loadLibrary("HelloNative");
    }

    public static native void sayHello();

    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        new HelloNative().sayHello();
    }
}
