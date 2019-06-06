/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_16 {
    public static void main(String[] args) {
        double length=new Scanner(System.in).nextDouble();
        double area=Math.pow(length, 2)*3*Math.pow(3, 0.5)/2;
        System.out.println(area);
    }
}
