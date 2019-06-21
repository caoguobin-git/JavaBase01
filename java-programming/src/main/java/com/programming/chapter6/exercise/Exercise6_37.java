/***********************************************
 * File Name: Exercise6_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 11:34
 ***********************************************/

package com.programming.chapter6.exercise;


import java.util.Scanner;

public class Exercise6_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int width=scanner.nextInt();
        String result = format(n,width);
        System.out.println(result);
    }

    private static String format(int n, int x) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<x-String.valueOf(n).length();i++){
            sb.append("0");
        }
        sb.append(n);
        return sb.toString();
    }


}
