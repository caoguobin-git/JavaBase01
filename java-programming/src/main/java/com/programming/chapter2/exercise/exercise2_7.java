/***********************************************
 * File Name: exercise2_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 12:44
 ***********************************************/

package com.programming.chapter2.exercise;

import java.util.Scanner;

public class exercise2_7 {
    public static void main(String[] args) {
        final long MINUTES_OF_DAY=24*60;
        final long MINUTES_OF_YEAR=365*MINUTES_OF_DAY;
        System.out.println("Enter the number of minutes: ");
        Scanner scanner=new Scanner(System.in);
        long minutes=scanner.nextLong();
        int year= (int) (minutes/MINUTES_OF_YEAR);
        int day= (int) (minutes%MINUTES_OF_YEAR/MINUTES_OF_DAY);
        System.out.println(minutes+" minutes is approximately "+year+" years and "+day+" days");

    }
}
