package com.ljw.sgw_singleton_demo;

//双重锁校验模式
public class Singleton_3 {
    private static volatile Singleton_3 instance;

    private Singleton_3() {
    }

    public static Singleton_3 getInstance() {
        if (instance == null) {
            synchronized (Singleton_3.class) {
                if (instance == null) {
                    instance = new Singleton_3();
                }
            }
        }
        return instance;
    }

}
