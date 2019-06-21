/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


public class exercise5_18 {
    public static void main(String[] args) {
        for (int i=1;i<=6;i++){
            for (int j=1;j<=i;j++){
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
        System.out.println();

        for (int i=6;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
        System.out.println();
    }
}
