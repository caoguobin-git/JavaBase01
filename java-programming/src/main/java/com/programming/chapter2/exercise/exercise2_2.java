/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius=input.nextDouble();
        double height=input.nextDouble();
        double area=radius*radius*Math.PI;
        double volume=area*height;
        System.out.printf("The area is %.1f\n",area);
        System.out.printf("The volume is %.1f",volume);
    }
}
