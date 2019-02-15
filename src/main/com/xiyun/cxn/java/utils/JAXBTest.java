package main.com.xiyun.cxn.java.utils;

import main.com.xiyun.cxn.java.model.Student;
import main.com.xiyun.cxn.java.model.StudentList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.List;

/**
 * @program javaany_
 * @description: JAXB 实现java对象与xml之间互相转换
 * @author: cxn
 * @create: 2018/11/27 09:09
 */
public class JAXBTest {

    /**
     * java对象转换为xml文件
     * @param xmlPath  xml文件路径
     * @param load    java对象.Class
     * @return    xml文件的String
     * @throws JAXBException
     */
    public static String beanToXml(Object obj,Class<?> load) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(load);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj,writer);
        return writer.toString();
    }
//    public static void main(String[] args) throws JAXBException, IOException {
//        List<String> hobby = new ArrayList<String>();
//        hobby.add("篮球");
//        hobby.add("音乐");
//        hobby.add("乒乓球");
//
//        List<Student> studentList = new ArrayList<>();
//
//        Student st = new Student("张三", "男", 10001, "尖子班", hobby);
//        studentList.add(st);
//        Student st1 = new Student("李四", "男", 10002, "普通班", hobby);
//        studentList.add(st1);
//        Student st2 = new Student("莉莉", "女", 10003, "普通班", hobby);
//        studentList.add(st2);
//
//        StudentList students = new StudentList();
//        students.setStudents(studentList);
//        String str = JAXBTest.beanToXml(students, StudentList.class);
//
//        //写入到xml文件中
//        String xmlPath = "/Users/cxn/Downloads/xmltest1.xml";
//        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(xmlPath)));
//        bfw.write(str);
//        bfw.close();
//    }



    /**
     * xml文件配置转换为对象
     * @param xmlPath  xml文件路径
     * @param load    java对象.Class
     * @return    java对象
     * @throws JAXBException
     * @throws IOException
     */
    public static Object xmlToBean(String xmlPath,Class<?> load) throws JAXBException, IOException{
        JAXBContext context = JAXBContext.newInstance(load);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new File(xmlPath));
        return object;
    }

    public static void main(String[] args) throws IOException, JAXBException {
        String xmlPath =  "/Users/cxn/Downloads/xmltest1.xml";
        Object object = JAXBTest.xmlToBean(xmlPath,StudentList.class);
        StudentList students = (StudentList)object;
        List<Student> studentList = students.getStudents();

        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i).getName());
            System.out.println(studentList.get(i).getSex());
            System.out.println(studentList.get(i).getNumber());
            System.out.println(studentList.get(i).getClassName());
            for(String str :studentList.get(i).getHobby()){
                System.out.print(str+" ");
            }
            System.out.println("-------------");
        }
    }
}
