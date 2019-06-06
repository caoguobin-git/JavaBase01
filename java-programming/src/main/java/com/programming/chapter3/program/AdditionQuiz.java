/***********************************************
 * File Name: AdditionQuiz
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 13:34
 ***********************************************/

package com.programming.chapter3.program;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        System.out.println("What is the result of " + num1 + "+" + num2 + ":");
        int result = new Scanner(System.in).nextInt();
        System.out.println(num1 + "+" + num2 + "=" + result + " is " + (num1 + num2 == result));

    }
}
