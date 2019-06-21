/***********************************************
 * File Name: Exercise6_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 11:34
 ***********************************************/

package com.programming.chapter6.exercise;


import java.util.Scanner;

public class Exercise6_3 {
    public static void main(String[] args) {
        System.out.println("Enter a integer:");
        int n =new Scanner(System.in).nextInt();
       boolean result=isPalindrome(n);
        System.out.println(result);
    }

    private static boolean isPalindrome(int n) {
        return n==reverse(n);
    }

    private static int reverse(int n){
        int result=0;
        String s = String.valueOf(n);
        for (int i=s.length()-1;i>=0;i--){
            result+=Math.pow(10, i)*(n%10);
            n=n/10;
        }
        return result;
    }

}
