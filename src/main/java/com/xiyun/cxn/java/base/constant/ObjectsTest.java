package com.xiyun.cxn.java.base.constant;

import java.text.SimpleDateFormat;
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

//
//        Stack<String> st = new Stack<String>();
//        st.push("a");
//        st.push("b");
//        st.push("c");
//        st.push("d");
//
//        System.out.println("st ->" + st);
//
//        System.out.println(st.pop());
//        System.out.println("get 4 -> " + st.get(4));
//
//        WeakHashMap weakHashMap = new WeakHashMap();
//        //weakHashMap.wait();

//        String prefix = new SimpleDateFormat("yyyyMMdd").format(new Date()).substring(2);
//        SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
//
//        String format = date.format(new Date());
//
//        System.out.println(format);
//
//        System.out.println(format.substring(2));
//
//
//        TreeMap<String, String> stringStringTreeMap = new TreeMap<String, String>(new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });


        SortedMap<String, String> map = new TreeMap<String, String>();
        map.put("i1", "a");
        map.put("h2", "b");
        map.put("g3", "c");
        map.put("f4", "d");
        map.put("e5", "e");
        map.put("d6", "f");
        map.put("c7", "g");
        map.put("b8", "h");
        map.put("a9", "i");


        System.out.println("firstKey = " + map.firstKey());
        System.out.println("lastKey = " + map.lastKey());


        System.out.println("headMap = " + map.headMap("5"));


        System.out.println(map);
    }
}
