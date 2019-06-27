
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = scanner.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = scanner.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = scanner.nextInt();
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int century = year / 100;
        int yearOfCentury = year % 100;
        String[] weekdays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int dayOfWeek = (day + (26 * (month + 1)) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
        System.out.println("Day of the week is " + weekdays[dayOfWeek]);
    }
}
