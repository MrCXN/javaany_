package xiyun.cxn.java.test1;

/**
 * @program javaany_
 * @description: builder设计模式
 * @author: cxn
 * @create: 2019/04/19 15:32
 */
public class SubStrigTest {

    public static void main(String[] args) {
      String tradeNO =  "Z12312312312_N12s3";

        String s = tradeNO.split("_")[1];

        String substring = s.substring(1);
        System.out.println(substring);
    }
}
