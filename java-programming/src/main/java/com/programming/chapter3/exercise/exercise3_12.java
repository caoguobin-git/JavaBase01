
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_12 {

    public static void main(String[] args) {
        int x= new Scanner(System.in).nextInt();
        System.out.println(x+"是回文数："+(x%10==x/100));
    }
}
