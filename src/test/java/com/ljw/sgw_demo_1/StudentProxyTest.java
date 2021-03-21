package com.ljw.sgw_demo_1;

public class StudentProxyTest {
    public static void main(String[] args) {
        //生成张三
        Person zhangsan = new Student("张三");
        Person lisi = new Student("李四");

        //生成代理对象，并传入张三
        Person monitor = new StudentProxy(zhangsan);
        Person monitor1 = new StudentProxy(lisi);

        //班长上交班费
        monitor.giveMoney();
        monitor1.giveMoney();
    }
}
