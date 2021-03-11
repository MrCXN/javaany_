package com.xiyun.cxn.java.base.io;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2021/03/09 11:14
 */
public class ReadTest {

    public static void main(String[] args) {
        String argetPathName = "/Users/cxn/Downloads/C";
        String pathName = "/Users/cxn/Downloads/D";
        ArrayList<String> list = new ArrayList();
        ArrayList<String> targetList = new ArrayList();
        dealErrorTradeFile(argetPathName, pathName, targetList, list);
    }


    private static void dealErrorTradeFile(String targetPathName, String pathName, ArrayList<String> targetList, ArrayList<String> list) {

        ArrayList<String> haveList = new ArrayList();
        ArrayList<String> noHaveList = new ArrayList();

        targetList = readFile(targetPathName, targetList);

        list = readFile(pathName, list);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(targetList.contains(s)){
                haveList.add(s);
            }else {
                noHaveList.add(s);
            }

        }
        System.out.println(JSONObject.toJSONString(haveList));
        System.out.println(JSONObject.toJSONString(noHaveList));

    }


    private static ArrayList<String> readFile(String pathName, ArrayList<String> list){
        File file = new File(pathName);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                if (str.length() > 0) {
                    list.add(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
