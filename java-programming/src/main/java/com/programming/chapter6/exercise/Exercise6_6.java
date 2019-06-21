/***********************************************
 * File Name: Exercise6_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 11:34
 ***********************************************/

package com.programming.chapter6.exercise;


import java.util.Scanner;

public class Exercise6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        displayPattern(n);
    }

    private static void displayPattern(int n) {
        for (int i=0;i<n;i++){
            for (int j=n-i;j>0;j--){
                System.out.print("\t");
            }
            for (int j=i+1;j>0;j--){
                System.out.print("\t"+j);
            }
            System.out.println();
        }
    }

}
