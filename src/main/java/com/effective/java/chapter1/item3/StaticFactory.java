package com.effective.java.chapter1.item3;

/**
 * 公有静态成员是一个final域
 */
public class StaticFactory {
    private static final StaticFactory sf = new StaticFactory();

    public static StaticFactory getInstance() {
        return sf;
    }

    private StaticFactory() {

    }
}
