package com.xiyun.cxn.java.singleton;

import java.io.Serializable;

/**
 * @program javaany_
 * @description: SerSingleton
 * @author: cxn
 * @create: 2020/04/09 16:09
 */
public class SerSingletonTest implements Serializable {

    String name;

    private SerSingletonTest() {
        System.out.println("Singleton is creating");
    }

    private static SerSingletonTest instance = new SerSingletonTest();

    public static SerSingletonTest getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("create string in singleton");
    }

    private Object readResolve() {
        System.out.println("read resolve");
        return instance;
    }


    public static void main(String[] args) {
        Object[] obs = new Object[]{1, 2, 3, 4, 5, 6, 7};
        int length = obs.length;
        System.out.println(obs[--length]);

    }

}
