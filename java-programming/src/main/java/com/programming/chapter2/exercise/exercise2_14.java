/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double weight =input.nextDouble();
        double height=input.nextDouble();
        weight=weight*0.45359273;
        height=height*0.0254;
        System.out.println(weight/(height*height));
    }
}
