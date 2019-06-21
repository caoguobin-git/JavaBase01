/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;

import java.util.Scanner;

public class exercise5_17 {
    public static void main(String[] args) {
        int a=new Scanner(System.in).nextInt();
        getInzi(a);
    }

    private static void getInzi(int a) {
        for (int i=0;i<=a;i++){
            for (int j=0;j<a-i;j++){
                System.out.print("    ");
            }
            for (int k=i;k>0;k--){
                System.out.printf("%4d", k);
            }
            for (int m=2;m<=i;m++){
                System.out.printf("%4d", m);

            }
            System.out.println();
        }
    }
}
