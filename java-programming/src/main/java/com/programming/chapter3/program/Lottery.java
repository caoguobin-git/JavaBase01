/***********************************************
 * File Name: Lottery
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 16:28
 ***********************************************/

package com.programming.chapter3.program;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is: " + lottery);

        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2) {
            System.out.println("you win $10000");
        } else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1){
            System.out.println("you win $3000");
        } else if (lotteryDigit1==guessDigit1||lotteryDigit2==guessDigit2||lotteryDigit2==guessDigit1||lotteryDigit2==guessDigit2){
            System.out.println("you win $1000");
        }else {
            System.out.println("sorry, no match");
        }

    }
}
