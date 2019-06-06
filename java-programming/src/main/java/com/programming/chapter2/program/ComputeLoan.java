/***********************************************
 * File Name: ComputeLoan
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 11:49
 ***********************************************/

package com.programming.chapter2.program;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter annual interest rate, e.g., 7.25%");
        double annualInterestRate=input.nextDouble();
        double monthlyInterestRate=annualInterestRate/1200;
        System.out.println("Enter number of years as an integer, e.g., 5");
        int numberOfYears=input.nextInt();
        System.out.println("Enter loan amount, e.g.,");
        double loanAmount=input.nextDouble();
        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate /(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

         // Display results
         System.out.println("The monthly payment is " +
         (int)(monthlyPayment * 100)/ 100.0);
         System.out.println("The total payment is " +
               (int)(totalPayment * 100)/ 100.0);
    }
}
