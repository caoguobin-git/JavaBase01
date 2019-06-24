/***********************************************
 * File Name: QuotientWithIf
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 22 06 2019 14:18
 ***********************************************/

package com.programming.chapter12.program;

import java.util.Scanner;

public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        if (number2!=0){
            System.out.println(number1+" / "+number2+" is "+(number1/number2));
        }else {
            System.out.println("Divisor cannot be zero! ");
        }
    }
}
