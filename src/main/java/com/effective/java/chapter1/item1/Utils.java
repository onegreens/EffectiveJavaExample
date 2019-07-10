package com.effective.java.chapter1.item1;

import java.util.HashMap;
import java.util.Map;

public class Utils {
    public static Boolean valueOf(boolean value) {
        return value ? Boolean.TRUE : Boolean.FALSE;
    }

    public static <K, V> Map<K, V> newInstance() {
        return new HashMap<K, V>();
    }
}
