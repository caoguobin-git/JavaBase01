/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double celsius=input.nextDouble();
        double fahrenheit=(9.0/5)*celsius+32;
        System.out.println(fahrenheit);
    }
}
