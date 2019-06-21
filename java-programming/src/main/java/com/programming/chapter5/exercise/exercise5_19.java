/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


public class exercise5_19 {
    public static void main(String[] args) {

        for (int i=0;i<8;i++){
            for (int j=0;j<8-1-i;j++){
                System.out.print("    ");
            }
            for (int j=0;j<=i;j++){
                System.out.printf("%4d", (int)Math.pow(2, j));
            }

            for (int j=i-1;j>=0;j--){
                System.out.printf("%4d", (int)Math.pow(2, j));
            }

            System.out.println();
        }
    }
}
