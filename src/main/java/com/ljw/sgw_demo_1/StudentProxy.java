package com.ljw.sgw_demo_1;

import java.util.ArrayList;
import java.util.List;

/*
* 学生代理类
* */
public class StudentProxy implements Person{
    Student stu;


    public StudentProxy(Person stu){
        //只代理学生类
        if (stu.getClass() == Student.class){
            this.stu = (Student) stu;
        }
    }
    @Override
    public void giveMoney() {
        //System.out.println("1111");
        stu.giveMoney();
    }
}
