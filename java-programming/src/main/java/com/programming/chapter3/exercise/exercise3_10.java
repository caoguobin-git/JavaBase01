
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_10 {

    public static void main(String[] args) {
        int a = (int) (Math.random()*100);
        int b = (int) (Math.random()*100);
        System.out.print(a+"+"+b+"=");
        Scanner scanner=new Scanner(System.in);
        int inputSum=scanner.nextInt();
        if (a+b==inputSum){
            System.out.println("right");
        }else {
            System.out.println("Wrong  "+(a+b));
        }
    }
}
