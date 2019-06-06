/***********************************************
 * File Name: SimpleifDemo
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 13:45
 ***********************************************/

package com.programming.chapter3.program;

import java.util.Scanner;

public class SimpleifDemo {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a % 5 == 0) {
            System.out.println("HiFive");
        }
        if (a % 2 == 0) {
            System.out.println("HiEven");
        }

        boolean newLine=a%10==0;
        System.out.println(newLine);
    }
}
