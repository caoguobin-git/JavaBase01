
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_18 {

    public static void main(String[] args) {
        System.out.println("Enter the weight:");
        Scanner scanner=new Scanner(System.in);
        double weight=scanner.nextDouble();
        double cost = 0;
        if (weight<=1){
            cost=weight*3.5;
        }else if (weight<=3){
            cost=weight*5.5;
        }else if (weight<=10){
            cost=weight*8.5;
        }else if (weight<=20){
            cost=weight*10.5;
        }else if (weight>20){
            System.out.println("the package cannot be shipped.");
            return;
        }
        System.out.println(weight+"  "+cost);

    }
}
