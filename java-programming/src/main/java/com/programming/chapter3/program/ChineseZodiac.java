/***********************************************
 * File Name: ChineseZodiac
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 16:59
 ***********************************************/

package com.programming.chapter3.program;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        switch (year % 12) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
        }
    }
}
