/***********************************************
 * File Name: PrintCalendar
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 10:48
 ***********************************************/

package com.programming.chapter6.program;

import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full year:");
        int year = scanner.nextInt();

        System.out.print("Enter month as a number between 1 and 12: ");
        int month = scanner.nextInt();
        printMonth(year, month);
    }

    private static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    private static void printMonthTitle(int year, int month) {
        System.out.println("\t\t" + getMonthName(month) + "\t" + year);
        System.out.println("----------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

    }

    private static void printMonthBody(int year, int month) {
        int startDay=getStartDay(year, month);
        for (int i=0;i<startDay;i++){
            System.out.print("\t");
        }
        int control=startDay;
        for (int i=1;i<=getNumberOfDaysInMonth(year, month);i++){
            if (control%7==0){
                System.out.println();
            }
            System.out.print("\t"+i);
            control++;
        }

    }

    private static String getMonthName(int month) {
        String monthName="";
        switch (month) {
            case 1:
                monthName= "January";
                break;
            case 2:
                monthName= "February";
                break;
            case 3:
                monthName= "March";
                break;
            case 4:
                monthName= "April";
                break;
            case 5:
                monthName= "May";
                break;
            case 6:
                monthName= "June";
                break;
            case 7:
                monthName= "July";
                break;
            case 8:
                monthName= "August";
                break;
            case 9:
                monthName= "September";
                break;
            case 10:
                monthName= "October";
                break;
            case 11:
                monthName= "November";
                break;
            case 12:
                monthName= "December";
        }
        return monthName;
    }

    private static int getStartDay(int year, int month) {
        return 1;
    }

    private static int getTotalNumberOfDays(int year, int month) {
        return 100;
    }

    private static int getNumberOfDaysInMonth(int year, int month) {
        int days=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                days=(isLeapYear(year)?29:28);
        }
        return days;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


}
