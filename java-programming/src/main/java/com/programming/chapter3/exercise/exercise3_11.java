
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = 0;
        switch (month) {
            case 4:
                day = 30;
            case 6:
                day = 30;
            case 9:
                day = 30;
            case 11:
                day = 30;
                break;
            case 1:
                day = 31;
            case 3:
                day = 31;
            case 5:
                day = 31;
            case 7:
                day = 31;
            case 8:
                day = 31;
            case 10:
                day = 31;
            case 12:
                day = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            default:
                System.out.println("wrong month");
        }
        System.out.println(year+"年"+month+"月共有："+day+"天");
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0;
    }
}
