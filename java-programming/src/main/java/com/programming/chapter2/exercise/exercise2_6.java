/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_6 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
       int n=scanner.nextInt();
       int result =jisuan(n);
        System.out.println("The sum of the digits is "+result);

    }

    private static int jisuan(int n) {
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
