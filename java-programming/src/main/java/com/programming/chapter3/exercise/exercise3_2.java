
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_2 {

    public static void main(String[] args) {
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10);
        int c = (int) (Math.random()*10);
        System.out.print(a+"+"+b+"+"+c+"=");
        int result =new Scanner(System.in).nextInt();
        if (result==a+b+c){
            System.out.println("right");
        }else {
            System.out.println("wrong  "+(a+b+c));
        }

    }
}
