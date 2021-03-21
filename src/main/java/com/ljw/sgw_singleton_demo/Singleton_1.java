package com.ljw.sgw_singleton_demo;

import java.util.concurrent.*;

//懒汉式
public class Singleton_1 {
   private static Singleton_1 a;
   private Singleton_1(){}

    public static Singleton_1 getA() {
        if (a == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a = new Singleton_1();
        }
        return a;
    }
}

class Test_s1{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Singleton_1> b = () -> Singleton_1.getA();
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton_1> f1 = es.submit(b);
        Future<Singleton_1> f2 = es.submit(b);

        Singleton_1 s1 = f1.get();
        Singleton_1 s2 = f2.get();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}