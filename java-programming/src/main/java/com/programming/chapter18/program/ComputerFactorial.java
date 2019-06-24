/***********************************************
 * File Name: ComputerFactorial
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 06 2019 16:32
 ***********************************************/

package com.programming.chapter18.program;

import java.util.Scanner;

public class ComputerFactorial {
    public static void main(String[] args) {
        long x =new Scanner(System.in).nextLong();
        long result =factorial(x);
        System.out.println(result);
    }

    private static long factorial(long x) {
        if (x==0){
            return 1;
        }
        return x*factorial(x-1);
    }
}
