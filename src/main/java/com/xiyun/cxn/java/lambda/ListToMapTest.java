package com.xiyun.cxn.java.lambda;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/11/20 10:00
 */
public class ListToMapTest {


    public static void main(String[] args) {
        ArrayList<Merchant> merchants = new ArrayList<>();

        Merchant merchant = new Merchant();
        merchant.setGroupId("123");
        merchant.setGroupName("xiaohong");
        merchant.setCount(50);


        Merchant merchant1 = new Merchant();
        merchant1.setGroupId("123");
        merchant1.setGroupName("xiaohong");
        merchant1.setCount(150);

        Merchant merchant2 = new Merchant();
        merchant2.setGroupId("234");
        merchant2.setGroupName("xiaoli");
        merchant2.setCount(200);

        merchants.add(merchant);
        merchants.add(merchant1);
        merchants.add(merchant2);


        List<Merchant> collect = merchants.stream().filter(a -> a.getCount() == 200 || a.getCount() == 150).collect(Collectors.toList());

        System.out.println("111"+JSONObject.toJSONString(collect));

        //List<Merchant>  collect = merchants.stream().collect(Collectors.groupingBy();


        //Map<String, String> idNameMap = getIdNameMap(merchants);
        //merchants.stream().filter((t1,t2)->{t1.getGroupId().equals(t2.getGroupId())})


//        Map<String, String> groupIdNameMap =
//                merchants.stream().collect(Collectors.toMap(Merchant::getGroupId,
//                        groupConfig -> groupConfig.getGroupName(), (key1, key2) -> key1));
//
//
//        System.out.println(groupIdNameMap.toString());



        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(i->{
            try{
                if(i.intValue() == 1){
                    return;
                }

                System.out.println(i);
                System.out.println(123);
            }catch (Exception e){

            }

        });
        System.out.println("haha");
    }


    public static  Map<String, String> getIdNameMap(List<Merchant> ms) {
        return ms.stream().collect(Collectors.toMap(Merchant::getGroupId, Merchant::getGroupName));
    }

    static class Merchant{
        private String groupId;
        private String groupName;

        private Integer count;

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public Integer getCount() {

            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

}
