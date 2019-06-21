
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_22 {

    public static void main(String[] args) {
        System.out.println("Enter the point:");
        Scanner scanner=new Scanner(System.in);
        double x=scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("the point is"+(((Math.pow((Math.pow(x,2)+Math.pow(y, 2)),0.5))<10)?" ":" not ")+"in the circle");
    }
}
