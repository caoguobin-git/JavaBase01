/***********************************************
 * File Name: Exercise6_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 11:34
 ***********************************************/

package com.programming.chapter6.exercise;


import java.util.Scanner;

public class Exercise6_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((Math.random() < 0.5 ? 0 : 1) + " ");
            }
            System.out.println();
        }
    }

}
