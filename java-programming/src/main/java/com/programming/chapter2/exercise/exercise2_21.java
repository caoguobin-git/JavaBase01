/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double amount=input.nextDouble();
        double rate=input.nextDouble();
        double monthlyRate=rate/1200;
        int numberOfYear=input.nextInt();
        System.out.println(amount*Math.pow(1+monthlyRate, numberOfYear*12));
    }
}
