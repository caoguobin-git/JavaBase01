
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (x<=0||y<=0){
            System.out.println("not");
        }else{
            double theY=getY(x);
            if (theY>y){
                System.out.println("in");
            }else {
                System.out.println("not");
            }
        }
    }

    private static double getY(double x) {
        return 100*(200-x)/200;
    }
}
