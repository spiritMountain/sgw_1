package com.ljw.sgw_singleton_demo;
//饿汉式
public class Singleton_2 {
    private static Singleton_2 b = new Singleton_2();
    private Singleton_2(){}

    public static Singleton_2 getB() {
        return b;
    }
}
