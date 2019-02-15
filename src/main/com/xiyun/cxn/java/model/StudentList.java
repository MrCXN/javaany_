package main.com.xiyun.cxn.java.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program javaany_
 * @description: 所有学生信息的集合
 * @author: cxn
 * @create: 2018/11/27 09:36
 */
@XmlRootElement(name="list")
public class StudentList {

    List<Student> students;    //所有学生信息的集合

    @XmlElement(name = "student")
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
