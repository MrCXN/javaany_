package main.java.com.xiyun.cxn.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/11/23 15:57
 */
public class ListRedmianTest {


    public static void main(String[] args) {
        String[] strs =  new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
        List<String> strings = Arrays.asList(strs);


        String[] strss =  new String[]{"a","s","d","f","g","h","7","8","9","10","11","12","13","14","15","16"};
        List<String> stringss = Arrays.asList(strss);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(strings);
        System.out.println(arrayList.toString());
        arrayList.addAll(stringss);

        System.out.println(arrayList.toString());



        //批量插入-3条/次
        int thirdDOCount = strings.size();
       

        int loopCount = thirdDOCount / 3 + 1;
        for (int i = 1; i <= loopCount; i++) {
            List<String> insertDOS = new ArrayList<>();
            if (i < loopCount) {
                for (int j = 0; j < 3; j++) {
                    insertDOS.add(strings.get((i-1)*3+j));
                }
            } else {
                for (int j = 0; j < thirdDOCount % 3; j++) {
                    insertDOS.add(strings.get((i-1)*3+j));
                }
            }
            System.out.println("i->"+insertDOS);
        }
    }


}
