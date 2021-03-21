package com.ljw.sgw_jichu;

import org.junit.Test;

public class Test_1 {
    private static Test_1 instance;
    private Test_1(){}

    public static Test_1 getInstance() {
        if (instance == null){
            instance = new Test_1();
        }
        return instance;
    }
}


class cs{
    public static void main(String[] args) {
        Test_1 t1 = Test_1.getInstance();
        Test_1 t2 = Test_1.getInstance();
        System.out.println(t1==t2);
    }

}