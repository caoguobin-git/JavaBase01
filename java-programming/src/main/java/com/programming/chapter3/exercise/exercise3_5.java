
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int today = scanner.nextInt();
        int x=scanner.nextInt();
        
        String day = null;
        switch ((today+x)%7) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
        }

        System.out.println(day);
    }
}
