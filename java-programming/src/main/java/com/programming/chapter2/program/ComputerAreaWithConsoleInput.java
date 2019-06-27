/***********************************************
 * File Name: ComputerAreaWithConsoleInput
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 25 06 2019 15:53
 ***********************************************/

package com.programming.chapter2.program;

import java.util.Scanner;

public class ComputerAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius=scanner.nextDouble();

        double area=Math.pow(radius, 2)*Math.PI;
        System.out.println("The area for the circle of radius "+radius+" is "+area);
    }
}
