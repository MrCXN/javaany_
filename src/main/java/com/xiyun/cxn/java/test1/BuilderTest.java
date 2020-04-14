package xiyun.cxn.java.test1;

import xiyun.cxn.java.model.Anything;

/**
 * @program javaany_
 * @description: builder设计模式
 * @author: cxn
 * @create: 2019/04/19 15:32
 */
public class BuilderTest {

    public static void main(String[] args) {
        Anything anything  = new Anything.Builder().address(1).name("1").password("1").like("zuqiu").build();
        anything.setLike(null);
        String s = anything.toLike();

        System.out.println(anything.getName()+"like="+s);
    }
}
