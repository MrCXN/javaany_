package com.xiyun.cxn.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2021/02/21 16:12
 */
public class FilterProperty {


    public static void main(String[] args) {


        Usuer user = new Usuer();
        user.setAge(1);
        user.setName("sss");
        user.setDesc("nb");

        PropertyFilter profilter = FilterProperty.filterPro();

        Long stattime = System.currentTimeMillis();
        String json = JSONObject.toJSONString(user, profilter);

        Long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - stattime) + "ms");

    }


    public static PropertyFilter filterPro() {

        PropertyFilter profilter = new PropertyFilter() {

            @Override
            public boolean apply(Object object, String name, Object value) {
                if (name.equalsIgnoreCase("name")) {
                    //false表示last字段将被排除在外
                    return false;
                }
                return true;
            }

        };
        return profilter;
    }


    static class Usuer {

        private String name;
        private int age;
        private String desc;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }


}




