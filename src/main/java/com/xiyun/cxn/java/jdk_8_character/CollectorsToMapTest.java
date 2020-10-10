package com.xiyun.cxn.java.jdk_8_character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @program javaany_
 * @description: j8_toMap
 * @author: cxn
 * @create: 2020/10/10 10:24
 */
public class CollectorsToMapTest {

    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();

        Product p1 = new Product();
        p1.setName("杯子");
        p1.setType("日用");
        p1.setDesc("器物");
        Product p2 = new Product();
        p2.setName("汽车");
        p2.setType("交通工具");
        p2.setDesc("宝马三系");
        Product p3 = new Product();
        p3.setName("雀巢");
        p3.setType("咖啡");
        p3.setDesc("一丝润滑");
        Product p4 = new Product();
        p4.setName("碗");
        p4.setType("日用");
        p4.setDesc("器物");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);


        long countNum = list.stream().filter(a -> a.getType().equals("日用")).count();
        System.out.println(countNum);
        Stream<Product> stream = list.stream();


    }

    static class Product {
        String name;
        String type;
        String desc;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
