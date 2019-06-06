/***********************************************
 * File Name: exercise3_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 17:19
 ***********************************************/

package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_1 {
    public static void main(String[] args){
        System.out.println("Enter the abc: ");
        Scanner scanner=new Scanner(System.in);
        double a =scanner.nextDouble();
        double b =scanner.nextDouble();
        double c =scanner.nextDouble();
        double v = Math.pow(b, 2) - 4 * a * c;
        if (v>0){
            double result1=(-b+Math.pow(b*b-4*a*c, 0.5))/2*a;
            double result2=(-b-Math.pow(b*b-4*a*c, 0.5))/2*a;
            System.out.println("The result is : "+result1+"  "+result2);
        }else if (v==0){
            double result =-b/(2*a);
            System.out.println(result);
        }else {
            System.out.println("该方程没有实根！");
        }


    }
}
