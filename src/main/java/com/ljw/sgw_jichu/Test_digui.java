package com.ljw.sgw_jichu;

import org.junit.Test;

import java.util.Scanner;

public class Test_digui {
    public int f(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }
@Test
    public void test(){
    Scanner scanner = new Scanner(System.in);
    int s = scanner.nextInt();

        System.out.println(f(s));
    }
}
