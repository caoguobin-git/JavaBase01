/***********************************************
 * File Name: Test
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 16:00
 ***********************************************/

package com.javabase.day07.day0703;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("1. 猜数字");
        System.out.println("2. 猜字母");
        System.out.print("选择：");
        int c = new Scanner(System.in).nextInt();
        if(c != 1 && c != 2) {
            return;
        }
        GuessGame game;
        if(c == 1) {
            game = new GuessNumberGame();
        } else {
            game = new GuessLetterGame();
        }
        game.start();
    }
}
