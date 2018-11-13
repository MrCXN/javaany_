package main.java.com.xiyun.cxn.java.base.excrption;

import java.util.ArrayList;
import java.util.List;

/**
 * @program javaany_
 * @description: 自定义异常-test
 * @author: cxn
 * @create: 2018/11/13 08:57
 */
public class CustomException {

    public static void main(String[] args) throws ExceptionList {

        List list = new ArrayList();

        if (list.size() == 0)
            throw new ExceptionList("sdsdfsd");
        System.out.println(list);
    }
}
