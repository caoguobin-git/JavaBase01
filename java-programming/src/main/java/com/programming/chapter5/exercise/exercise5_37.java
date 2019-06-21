/***********************************************
 * File Name: exercise5_12
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:16
 ***********************************************/

package com.programming.chapter5.exercise;


import java.util.Scanner;

public class exercise5_37 {
    public static void main(String[] args) {
        System.out.println("Enter a integer:");
        int a=new Scanner(System.in).nextInt();
        System.out.println(Integer.toBinaryString(a));
        StringBuilder sb=new StringBuilder();
        while (a>=1){
            sb.append(a%2);
            a/=2;
        }
        for (int i=sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));
        }
    }
}
