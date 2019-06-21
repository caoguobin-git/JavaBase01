/***********************************************
 * File Name: Palindrome
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:06
 ***********************************************/

package com.programming.chapter5.program;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String a =new Scanner(System.in).nextLine();
        boolean result =judgePalindrome(a);
        System.out.println(result);
    }

    private static boolean judgePalindrome(String a) {
        int start =0;
        int end=a.length()-1;
        while (start<=end){
            if (a.charAt(start)!=a.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
