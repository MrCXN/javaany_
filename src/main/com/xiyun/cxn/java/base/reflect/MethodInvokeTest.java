package main.com.xiyun.cxn.java.base.reflect;

import main.com.xiyun.cxn.java.model.Student;

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
            for (Method method : methods){
                System.out.println(method.getName());
            }
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field: declaredFields) {
                System.out.println("私有方法="+field.getName());
            }


            Method setNumber = clazz.getMethod("setNumber");
            setNumber.invoke(12);
            Method getNumber = clazz.getMethod("getNumber",null);
            //Object invoke = getNumber.invoke();
            //System.err.println("invoke"+invoke);
        }catch (Exception e) {
            e.printStackTrace();
            System.err.println("-=======");
        }
    }
}
