/***********************************************
 * File Name: Exercise6_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 11:34
 ***********************************************/

package com.programming.chapter6.exercise;


public class Exercise6_1 {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            if (i%10==0){
                System.out.println();
            }
            System.out.printf("%8d",getPentagonalNumber(i+1));
        }
    }

    private static int getPentagonalNumber(int n) {
        return n * (n * 3 - 1) / 2;
    }
}
