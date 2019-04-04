package main.com.xiyun.cxn.java.test;

import main.com.xiyun.cxn.java.model.Student;

/**
 * @program javaany_
 * @description: String测试
 * @author: cxn
 * @create: 2019/01/10 12:58
 */
public class StringTest {
    public static void main(String[] args) {
//        Student student = new Student();
//        String isvMerchantId = new String();
//        int a = 0;
//
//        setStudent(student);
//        System.out.println("student=" + student.getClassName());
//        getSomeThing(isvMerchantId);
//        System.out.println("isvMerchantId=" + isvMerchantId);
//        setIntSomeThing(a);
//        System.out.println("setIntSomeThing ====== "+a);

        String tradeNo = "ssssssos12312312312";
        System.out.println(tradeNo.indexOf("sos"));

    }

    private static void setStudent(Student student){
        student.setClassName("yiban");
    }
    private static void setIntSomeThing(int a){
       a=2;
    }

    private static void getSomeThing(String isvMerchantId){
        String someThing = "someThing";
        if(isvMerchantId == null){
            isvMerchantId = "isvMerchantId";
        }
//        return  someThing + isvMerchantId;
    }



}
