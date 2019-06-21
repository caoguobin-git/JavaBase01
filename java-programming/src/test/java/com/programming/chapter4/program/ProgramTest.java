/***********************************************
 * File Name: ProgramTest
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 9:21
 ***********************************************/

package com.programming.chapter4.program;

import org.junit.Test;

import java.util.Scanner;

public class ProgramTest {

    @Test
    public void test4_8() {
        System.out.println((int) '1');
        System.out.println((int) 'A');
        System.out.println((int) 'B');
        System.out.println((int) 'a');
        System.out.println((int) 'b');
        System.out.println((char) 40);
        System.out.println((char) 59);
        System.out.println((char) 79);
        System.out.println((char) 85);
        System.out.println((char) 90);
        System.out.println((char) 0x40);
    }

    @Test
    public void test4_10() {
        System.out.println("\\");
        System.out.println("\"");
    }

    @Test
    public void test4_11() {
        System.out.println((int) 1000.34f);
    }

    @Test
    public void test4_13() {
        char x = 'a';
        char y = 'c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);
    }

    @Test
    public void test4_14() {
        char x = 'a';
        System.out.println((char) (x + Math.random() * 26));
    }


    @Test
    public void test4_16() {
        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        System.out.println(s1 == s2);
    }

    @Test
    public void program4_1() {
        System.out.println("Enter the distance:");
        double dis = new Scanner(System.in).nextDouble();
        double area = 5 * Math.pow((2 * dis * Math.sin(Math.PI / 5)), 2) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("%6.2f", area);
    }

    @Test
    public void test_111() {
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                for (int k = 0; k < 10000; k++){
                    System.out.printf("%6d   %6d  %6d", i,j,k);
                }
            }
        }
    }
}
