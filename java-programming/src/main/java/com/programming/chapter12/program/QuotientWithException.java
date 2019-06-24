/***********************************************
 * File Name: QuotientWithException
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 22 06 2019 14:23
 ***********************************************/

package com.programming.chapter12.program;

import java.util.Scanner;

public class QuotientWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        }catch (ArithmeticException e){
            System.out.println("Exception: an integer cannot be divided by zero! ");
        }

        System.out.println("Execution continues...");
    }

    private static int quotient(int number1, int number2) {
        if (number2==0){
            throw new ArithmeticException("Divisor cannot be zero! ");
        }
        return number1/number2;
    }
}
