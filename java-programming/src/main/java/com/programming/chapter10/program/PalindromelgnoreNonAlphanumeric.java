/***********************************************
 * File Name: PalindromelgnoreNonAlphanumeric
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 13:49
 ***********************************************/

package com.programming.chapter10.program;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;


public class PalindromelgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=scanner.nextLine();
        boolean matches = s.matches("\\d{3}");
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        String s1=filter(s);
        String s2=reverse(s1);
        return s2.equals(s1);
    }

    private static String filter(String s) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    private static String reverse(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
