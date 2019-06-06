/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double subtotal=input.nextDouble();
        double rate=input.nextInt();
        rate=rate/100.0;
        subtotal+=subtotal*rate;
        System.out.println(subtotal);

    }
}
