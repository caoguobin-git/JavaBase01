
package com.programming.chapter3.exercise;

import java.util.HashSet;
import java.util.Set;

public class exercise3_4 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 12) + 1;
        String month;
        switch (a) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + a);
        }
        System.out.println(month);
    }
}
