package com.ljw.sgw_demo_2;

public class MonitorUtil {
    private static ThreadLocal<Long> t1 = new ThreadLocal<>();

    public static void start(){
        t1.set(System.currentTimeMillis());
    }

    public static void finish(String methodName){
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法所花费时间为" + (finishTime-t1.get()) + "ms");
    }
}
