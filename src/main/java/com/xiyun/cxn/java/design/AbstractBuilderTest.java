package com.xiyun.cxn.java.design;

import java.util.EnumSet;
import java.util.Objects;

/**
 * @program javaany_
 * @description: 抽象builder 测试
 * @author: cxn
 * @create: 2020/04/07 17:31
 */
public abstract class AbstractBuilderTest {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    abstract static class Builder<T extends Builder> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {

            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract AbstractBuilderTest builder();

        protected abstract T self();

    }

    AbstractBuilderTest(Builder<?> builder) {
        builder.toppings.clone();
    }

}
