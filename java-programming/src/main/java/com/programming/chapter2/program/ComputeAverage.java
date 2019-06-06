/***********************************************
 * File Name: ComputeAverage
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 11:08
 ***********************************************/

package com.programming.chapter2.program;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1=scanner.nextDouble();
        double num2=scanner.nextDouble();
        double num3=scanner.nextDouble();
        double average =(num1+num2+num3)/3;
        System.out.println(average);
    }
}
