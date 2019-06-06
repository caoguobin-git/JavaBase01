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
        double radius=input.nextDouble();
        double height=input.nextDouble();
        double volume=radius*radius*Math.PI*height;
        System.out.println(volume);
    }
}
