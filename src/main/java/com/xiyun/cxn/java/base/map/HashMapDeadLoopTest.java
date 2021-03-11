package com.xiyun.cxn.java.base.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2021/03/02 17:26
 */
public class HashMapDeadLoopTest {


    static final Map<Integer, Integer> map = new HashMap<>(2, 0.75f);

    public static void main(String[] args) throws InterruptedException {

        System.out.println((map.size() - 1) &hash(5));
        System.out.println((map.size() - 1) &hash(7));


        map.put(5, 55);

        new Thread("Thread1") {
            public void run() {
                map.put(7, 77);
                System.out.println(map);
            }

            ;
        }.start();

        new Thread("Thread2") {
            public void run() {
                map.put(3, 33);
                System.out.println(map);
            }

            ;
        }.start();

    }


    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
