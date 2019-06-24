/***********************************************
 * File Name: QuotientWithMethod
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 22 06 2019 14:21
 ***********************************************/

package com.programming.chapter12.program;

import java.util.Scanner;

public class QuotientWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " + result);
    }

    private static int quotient(int number1, int number2) {
        if (number2==0){
            System.out.println("Divisor cannot be zero! ");
            System.exit(1);
        }
        return number1/number2;
    }
}
