/***********************************************
 * File Name: GuessNumber
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 10:20
 ***********************************************/

package com.programming.chapter5.program;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number= (int) (Math.random()*101);
        Scanner scanner=new Scanner(System.in);
        int answer=-1;
        while (answer!=number){
            answer=scanner.nextInt();
            if (answer>number){
                System.out.println("too high");
            }else{
                System.out.println("too low");
            }
        }
        System.out.println("got it");
    }
}
