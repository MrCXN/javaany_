package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @program javaany_
 * @description: 迭代器
 * @author: cxn
 * @create: 2018/11/13 08:35
 */
public class IteratorTest {

    public static void main(String[] args) {

        List list = new ArrayList();

        if (list.size() == 0)
            throw new NullPointerException("sdsdfsd");
        System.out.println(list);
    }
}
