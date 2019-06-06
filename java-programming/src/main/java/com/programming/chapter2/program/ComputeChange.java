/***********************************************
 * File Name: ComputeChange
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 11:56
 ***********************************************/

package com.programming.chapter2.program;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int remainingAmount= (int) (input.nextDouble()*100);
        int numberOfOneDollars=remainingAmount/100;
        remainingAmount=remainingAmount%100;
        int numberOfQuarters=remainingAmount/25;
        remainingAmount=remainingAmount%25;
        int numberOfDimes=remainingAmount/10;
        remainingAmount=remainingAmount%10;
        int numberOfNickels=remainingAmount/5;
        remainingAmount=remainingAmount%5;
        int numberOfPennies=remainingAmount;
        System.out.println(numberOfOneDollars);
        System.out.println(numberOfQuarters);
        System.out.println(numberOfDimes);
        System.out.println(numberOfNickels);
        System.out.println(numberOfPennies);
    }
}
