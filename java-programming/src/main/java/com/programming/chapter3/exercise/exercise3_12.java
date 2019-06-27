
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_12 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int n=scanner.nextInt();
        System.out.println(n+" is"+((n%10==n/100)?"":" not")+" a palindrome");
    }
}
