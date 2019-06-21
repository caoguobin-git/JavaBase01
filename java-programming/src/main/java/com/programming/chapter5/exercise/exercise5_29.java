/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;

import java.util.Scanner;

public class exercise5_29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year =scanner.nextInt();
        System.out.println("Enter the day:");
        int day=scanner.nextInt();
        for (int i=1;i<=12;i++){
            displayMonth(year,i);
        }
    }

    private static void displayMonth(int year, int i) {
        System.out.println("\t\t\t"+year+"年"+i+"月");
        System.out.println("----------------------------------");
        switch (i){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                break;
            case 2:
        }
    }
}
