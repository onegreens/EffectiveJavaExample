package com.effective.java.chapter1.item3;

/**
 * 公有静态成员是一个final域
 */
public class StaticFinal {
    public static final StaticFinal sf = new StaticFinal();

    private StaticFinal() {

    }
}
