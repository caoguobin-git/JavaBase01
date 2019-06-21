
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_17 {

    public static void main(String[] args) {
        final String SCISSOR = "scissor";
        final String ROCK = "rock";
        final String PAPER = "paper";

        int computerType = (int) (Math.random() * 3);
        System.out.println(SCISSOR + "(0) " + ROCK + "(1) " + PAPER + "(2) :");
        Scanner scanner = new Scanner(System.in);
        int userType = scanner.nextInt();
        switch (userType) {
            case 0:
                switch (computerType) {
                    case 0:
                        System.out.println("The computer is "+SCISSOR+" too. It is a draw.");
                        break;
                    case 1:
                        System.out.println("The computer is "+ROCK+". You lose.");
                        break;
                    case 2:
                        System.out.println("The computer is "+PAPER+". You won.");
                        break;
                }
                break;
            case 1:
                switch (computerType) {
                    case 0:
                        System.out.println("The computer is "+SCISSOR+". You won");
                        break;
                    case 1:
                        System.out.println("The computer is "+ROCK+" too. It is a draw.");
                        break;
                    case 2:
                        System.out.println("The computer is "+PAPER+". You lose.");
                        break;
                }
                break;
            case 2:
                switch (computerType) {
                    case 0:
                        System.out.println("The computer is "+SCISSOR+". You lose.");
                        break;
                    case 1:
                        System.out.println("The computer is "+ROCK+". You won");
                        break;
                    case 2:
                        System.out.println("The computer is "+PAPER+" too. It is a draw.");
                        break;
                }
                break;
            default:
                System.out.println("wrong number");
                return;
        }
    }
}
