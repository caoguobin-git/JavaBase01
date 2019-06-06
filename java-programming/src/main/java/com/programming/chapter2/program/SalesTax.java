/***********************************************
 * File Name: SalesTax
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 11:42
 ***********************************************/

package com.programming.chapter2.program;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter purchase amount: ");
        double purchaseAmount=input.nextDouble();
        double tax=purchaseAmount*0.06;
        System.out.println((int)(tax*100)/100.0);
    }
}
