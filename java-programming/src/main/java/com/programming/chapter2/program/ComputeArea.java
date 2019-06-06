/***********************************************
 * File Name: ComputeArea
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 11:02
 ***********************************************/

package com.programming.chapter2.program;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        radius=new Scanner(System.in).nextDouble();
        area=radius*radius*Math.PI;
        System.out.println("The area for the circle of radius "+radius+" is "+area);
    }
}
