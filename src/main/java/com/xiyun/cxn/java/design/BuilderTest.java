package com.xiyun.cxn.java.design;

import com.xiyun.cxn.java.design.AbstractBuilderTest;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/04/08 10:57
 */
public class BuilderTest extends AbstractBuilderTest {

    BuilderTest(Builder<?> builder) {
        super(builder);
    }


    class innerClassTest extends AbstractBuilderTest.Builder {

        @Override
        AbstractBuilderTest builder() {
            return null;
        }

        @Override
        protected Builder self() {
            return null;
        }
    }

}
