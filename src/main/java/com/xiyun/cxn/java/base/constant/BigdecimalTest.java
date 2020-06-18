package xiyun.cxn.java.base.constant;

import java.math.BigDecimal;

/**
 * @program javaany_
 * @description: bigdecimal start..
 * @author: cxn
 * @create: 2018/11/07 09:27
 */
public class BigdecimalTest {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(0);
        BigDecimal b = new BigDecimal(-1);
        BigDecimal c = new BigDecimal(2);
        BigDecimal d = new BigDecimal(2);


        System.out.println(c.compareTo(d));

        if(b.compareTo(a) < 1){
            System.out.println("b<a");
        }

        if(d.compareTo(a) < 1){
            System.out.println("d<a");
        }
    }

}
