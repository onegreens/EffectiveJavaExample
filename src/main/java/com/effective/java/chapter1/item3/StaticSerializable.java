package com.effective.java.chapter1.item3;

import java.io.Serializable;

public class StaticSerializable implements Serializable{
    private static final StaticSerializable ss = new StaticSerializable();

    public static StaticSerializable getInstance() {
        return ss;
    }

    private StaticSerializable() {

    }

//    private Object readResolve(){
    //return the one true obj and let the garbage collector take care of the obj impersonator
//        return INSTANCE;
//    }
}
