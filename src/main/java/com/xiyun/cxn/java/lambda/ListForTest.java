package main.java.com.xiyun.cxn.java.lambda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/11/25 14:55
 */
public class ListForTest {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        List<List<String>> loopList = new ArrayList<>();

        loopList.add(list);


        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");


        System.out.println(loopList.get(0).size());


        Long time = null;
        Date date = new Date(time);
    }
}
