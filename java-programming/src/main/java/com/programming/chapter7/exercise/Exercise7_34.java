/***********************************************
 * File Name: Exercise7_23
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 16:38
 ***********************************************/

package com.programming.chapter7.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String result=sort(a);
        System.out.println(result);
    }

    private static String sort(String a) {
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }


}
