/***********************************************
 * File Name: LeapYear
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 16:25
 ***********************************************/

package com.programming.chapter3.program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        if (isLeapYear(year)){
            System.out.println("是！");
        }else {
            System.out.println("不是！");
        }
    }

    private static boolean isLeapYear(int year) {
        return (year%4==0 && year%100!=0)||year%400==0;
    }
}
