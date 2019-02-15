package main.com.xiyun.cxn.java.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @program javaany_
 * @description: 学生
 * @author: cxn
 * @create: 2018/11/27 09:12
 */
public class Student {

    private String name;  //姓名
    private String sex;    //性别
    private int number;     //学号
    private String className;    //班级
    private List<String> hobby;    //爱好

    public Student(){
    }

    public Student(String name, String sex,int number, String className,List<String> hobby) {
        this.name = name;
        this.sex = sex;
        this.number = number;
        this.className = className;
        this.hobby = hobby;
    }

    /**
     * 切记，如果java对象属性同时添加了get和set方法，注解不能定义在属性的定义上，只需在get或者set方法上定义一个即可，否则jaxb会报错！
     */

    @XmlAttribute(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlAttribute(name="sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @XmlAttribute(name="number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @XmlElement(name="className")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    @XmlElementWrapper(name="hobbys")
    @XmlElement(name = "hobby")
    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }
}
