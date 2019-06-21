/***********************************************
 * File Name: RepeatAdditionQuiz
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 10:17
 ***********************************************/

package com.programming.chapter5.program;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1= (int) (Math.random()*10);
        int number2= (int) (Math.random()*10);

        Scanner scanner=new Scanner(System.in);
        System.out.println("what is "+number1+"+"+number2+"?");
        int answer=scanner.nextInt();
        while (number1+number2!=answer){
            System.out.println("try again");
            answer=scanner.nextInt();
        }

        System.out.println("right");
    }
}
