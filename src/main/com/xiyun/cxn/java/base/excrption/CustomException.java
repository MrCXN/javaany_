package main.com.xiyun.cxn.java.base.excrption;

/**
 * @program javaany_
 * @description: 自定义异常-test
 * @author: cxn
 * @create: 2018/11/13 08:57
 */
public class CustomException {

    public static void main(String[] args) {
        try {
            testExc1(null);
        } catch (ExceptionList exceptionList) {
            exceptionList.printStackTrace();
        }
    }

    public static void testExc1(Integer test) throws  ExceptionList{
        testExc(null);
    }

    public static void testExc(Integer test) throws  ExceptionList{
        if(test == null){
            throw new ExceptionList("sdsdfsd");
        }
    }
}
