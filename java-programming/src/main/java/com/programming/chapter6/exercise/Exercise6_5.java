/***********************************************
 * File Name: Exercise6_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 11:34
 ***********************************************/

package com.programming.chapter6.exercise;


import java.util.Scanner;

public class Exercise6_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num1=scanner.nextDouble();
        double num2=scanner.nextDouble();
        double num3=scanner.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }

    private static void displaySortedNumbers(double num1, double num2, double num3) {
        double min = Math.min(Math.min(num1, num2), num3);
        double max = Math.max(Math.max(num1, num2), num3);
        System.out.println(min+"  "+(num1+num2+num3-min-max)+"  "+max);
    }
}
