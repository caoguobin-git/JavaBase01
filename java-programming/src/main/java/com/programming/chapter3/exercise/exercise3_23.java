
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_23 {

    public static void main(String[] args) {
        System.out.println("Enter the point: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("the point is" + ((Math.abs(x) < 5 && Math.abs(y) < 5.0 / 2) ? " " : " not ") + "in the square");

    }
}
