package com.xiyun.cxn.java.jdk_8_character;


import java.util.Optional;

/**
 * @program javaany_
 * @description: optional
 * 1.常用静态方法：
 *
 * Optional.of(T)	根据给定的引用创建Optional实例，若T为null，则抛出NullPointerException
 * Optional.absent()	创建一个不包含任何引用的Optional实例
 * Optional.fromNullable(T)	根据给定的引用创建Optional实例，若T为null，则创建一个Optional.absent
 *
 * 2.实例方法：
 *
 * boolean isPresent()	如果Optional实例持有者包含一个非null的实例，则返回True，否则返回false
 * T get()	如果Optional实例持有者包含一个非null的实例，则返回非null的实例，否则抛IllegalStateException
 * T or(T defaultValue)	如果Optional实例持有者包含一个非null的实例，则返回非null的实例，否则返回这个defaultValue
 * T orNull()	如果Optional实例持有者包含一个非null的实例，则返回非null的实例，否则返回null
 * Set<T> asSet()	如果Optional实例持有者包含一个非null的实例，则返回一个只有一个元素的不可变Set，否则返回一个空Set
 * @author: cxn
 * @create: 2020/07/14 18:14
 */
public class OptionalTest {

    public static void main(String[] args) {
        //Optional<Object> o = Optional.of(null);

        Optional<Object> o1 = Optional.ofNullable(null);

        Integer num= 0;
        System.out.println(num.equals(0));


    }
}
