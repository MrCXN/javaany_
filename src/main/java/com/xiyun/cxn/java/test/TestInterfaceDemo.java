package xiyun.cxn.java.test1;

public interface TestInterfaceDemo extends  TestInterfaceDemo1 , TestInterfaceDemo2{

    void add(String id, String name, int age);
    void edit(String id, String name);
    void del(String id, String name);
}

