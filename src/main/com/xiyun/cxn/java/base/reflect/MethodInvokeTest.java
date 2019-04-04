package main.com.xiyun.cxn.java.base.reflect;

import main.com.xiyun.cxn.java.model.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program javaany_
 * @description: 测试发射执行方法
 * @author: cxn
 * @create: 2019/01/24 16:59
 */
public class MethodInvokeTest {

    public static void main(String[] args) {
        try {

            Class<Student> clazz = Student.class;

            Method[] methods = clazz.getMethods();
            /**
             * 获取全部属性
             */
           // Field[] declaredFields = clazz.getDeclaredFields();、
            /**
             * 获取public属性
             */
            Field[] declaredFields = clazz.getFields();

//            for (Method method : methods){
//
//            }


            for (Field declaredField : declaredFields){
                System.out.println(declaredField.getName());
            }
//            Field[] declaredFields = clazz.getDeclaredFields();
//            for (Field field: declaredFields) {
//                System.out.println("私有方法="+field.getName());
//            }
//
//
//            Method setNumber = clazz.getMethod("setNumber");
//            setNumber.invoke(12);
//            Method getNumber = clazz.getMethod("getNumber",null);
            //Object invoke = getNumber.invoke();
            //System.err.println("invoke"+invoke);

            Constructor con =  clazz.getConstructor();
            Student student = (Student) con.newInstance();
            Method method = clazz.getMethod("setSex", String.class);
            method.invoke(student,"nv");

            Method getSex = clazz.getMethod("getSex");

            String sex = (String)getSex.invoke(student,null);

            System.out.println("====" + sex);


            Method priMethodTest = clazz.getDeclaredMethod("priMethodTest", Object[].class);

            String[] s = new String[]{"aa","bb"};

            String str = (String)priMethodTest.invoke(student,  s);
            System.out.println("Methoc is priMethodTest result="+str);

        }catch (Exception e) {
            e.printStackTrace();
            System.err.println("-=======");
        }
    }
}
