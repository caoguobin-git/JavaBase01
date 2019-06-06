/***********************************************
 * File Name: SubtractionQuiz
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 15:58
 ***********************************************/

package com.programming.chapter3.program;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        int a= (int) (Math.random()*10);
        int b= (int) (Math.random()*10);
        if (a<b){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        System.out.println(a+"-"+b+"=?");
        int result =new Scanner(System.in).nextInt();
        if (a-b==result){
            System.out.println("right");
        }else {
            System.out.println("wrong, the correct result is: "+(a-b));
        }
    }
}
