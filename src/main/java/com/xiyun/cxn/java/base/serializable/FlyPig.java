package com.xiyun.cxn.java.base.serializable;

import java.io.Serializable;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2021/01/25 17:40
 */
public class FlyPig implements Serializable {
    private static final long serialVersionUID = 1L;
    private static String AGE = "269";
    private String name;
    private String color;
    transient private String car;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }


    private String addTip;
    public String getAddTip() {
        return addTip;
    }

    public void setAddTip(String addTip) {
        this.addTip = addTip;
    }

    @Override
    public String toString() {
        return "FlyPig{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", car='" + car + '\'' +
                ", AGE='" + AGE + '\'' +
                //", addTip='" + addTip + '\'' +
                '}';
    }
}
