/***********************************************
 * File Name: StaticTest
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 19 04 2019 16:48
 ***********************************************/

package com.duochuang.javabase.chapter01;

public class StaticTest implements Runnable {
    public static int a = 0;

    @Override
    public void run() {
        while (true) {
            a +=1;
            System.out.println(a);
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        StaticTest.a = a;
    }
}
