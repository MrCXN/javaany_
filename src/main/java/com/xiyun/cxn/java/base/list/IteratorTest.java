package com.xiyun.cxn.java.base.list;

import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program javaany_
 * @description: iteratorTest
 * @author: cxn
 * @create: 2020/04/15 16:44
 */
public class IteratorTest {

    public static void main(String[] args) {
        ItesatorRomve();
    }



    public static void ItesatorRomve() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(JSONObject.toJSONString(list));
//
//        Iterator it = list.iterator();
//        int i = 0;
//        String s = null;
//        try {
//            while(it.hasNext()){
//                if(i==2){
////                it.remove();// 如果用list.remove(it.next()),会报异常
//                    list.remove(it.next());
//                }
//                //System.out.println("第"+i+"个元素"+it.next());
//                i++ ;
//            }
//        }catch (Exception e){
//            System.out.println("list:"+list.toString());
//        }
//
//        System.out.println("----------------");
//        Iterator it2 = list.iterator();
//        while(it2.hasNext()){
//            System.out.println(it2.next());
//        }
//        LinkedHashSet
//        LinkedHashMap
//        TreeSet
                TreeMap treeMap = new TreeMap();
//       // LinkedHashSet
//          int MAXIMUM_CAPACITY = 1 << 30;
//        System.out.println(  MAXIMUM_CAPACITY );





    }

}
