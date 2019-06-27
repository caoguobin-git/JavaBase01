/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = scanner.nextDouble();
        double meters = feet * 0.305;
        System.out.printf("%.1f feet is %.4f meters",feet,meters);
    }
}
