package com.ljw.sgw_singleton_demo;

import org.junit.Test;

class test {
    public static void main(String[] args) {
        Singleton_4 s1 = Singleton_4.instance.getInstance();
        Singleton_4 s2 = Singleton_4.instance.getInstance();
        System.out.println(s1 == s2);
    }
}

public enum Singleton_4 {
    instance;

    public Singleton_4 getInstance() {
        return instance;
    }
}