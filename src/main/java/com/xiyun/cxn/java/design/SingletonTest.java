package com.xiyun.cxn.java.design;

import java.util.*;

/**
 * @program javaany_
 * @description: SingletonTest
 * @author: cxn
 * @create: 2020/04/14 16:24
 */
public class SingletonTest {

    private static SingletonTest singleton = new SingletonTest();
    public static int counter1;
    public static int counter2 = 0;

    private SingletonTest() {
        counter1++;
        counter2++;
    }

    public static SingletonTest getInstance() {
        return singleton;
    }

    Collection collection =  new ArrayList();
}


 class Test {

    public static void main(String[] args) {
//
//        SingletonTest instance = SingletonTest.getInstance();
//        synchronized (instance) {
//
//        }

//        SingletonTest singleton = SingletonTest.getInstance();
//        System.out.println("counter1 = " + singleton.counter1);
//        System.out.println("counter2 = " + singleton.counter2);




        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a");//0
        arrayList.add("b");//1
        arrayList.add("c");//2
        arrayList.add("d");//3
        arrayList.add("e");//4
        arrayList.add("f");//5
        arrayList.add("g");//6


        System.out.println(" get(4) = " + arrayList.get(4));
        arrayList.remove(4);
        System.out.println(" arrayList:"+arrayList.toString());

        arrayList.clone();
        //Vector
        //LinkedList
    }



}