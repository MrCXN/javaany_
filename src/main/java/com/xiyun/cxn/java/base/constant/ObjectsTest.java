package com.xiyun.cxn.java.base.constant;

import java.util.*;

/**
 * @program javaany_
 * @description: Objects
 * @author: cxn
 * @create: 2020/04/10 11:21
 */
public class ObjectsTest {


    public static void main(String[] args) {
//        String str = null;
//        System.out.println(Objects.requireNonNull(str));
//        ArrayList<Integer> list=new ArrayList<Integer>();


        Stack<String> st = new Stack<String>();
        st.push("a");
        st.push("b");
        st.push("c");
        st.push("d");

        System.out.println("st ->" + st);

        System.out.println(st.pop());
        System.out.println("get 4 -> " + st.get(4));

        WeakHashMap weakHashMap = new WeakHashMap();
        //weakHashMap.wait();

    }
}
