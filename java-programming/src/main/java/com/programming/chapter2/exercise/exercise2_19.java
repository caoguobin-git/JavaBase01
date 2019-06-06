/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double x3=input.nextDouble();
        double y3=input.nextDouble();
        double side1=getSide(x1,y1,x2,y2);
        double side2=getSide(x1, y1, x3, y3);
        double side3=getSide(x2, y2, x3, y3);
        double s=(side1+side2+side3)/2;
        double area=Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        System.out.println(area);
    }

    private static double getSide(double x1, double y1, double x2, double y2) {
        return Math.pow(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2), 0.5);
    }


}
