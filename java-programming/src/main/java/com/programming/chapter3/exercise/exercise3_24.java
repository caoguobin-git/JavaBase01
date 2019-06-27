
package com.programming.chapter3.exercise;

import java.util.*;

public class exercise3_24 {

    public static void main(String[] args) {
        final String[] pokerName = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        final String[] pokerColor = {"Clubs", "Diamonds", "Hearts", "Spades"};
        int n = new Random().nextInt(52);
        String poker1 = pokerName[n % 13];
        String poker2 = pokerColor[n / 13];
        System.out.println("The poker is " + poker2 + " " + poker1);
        final List<String> list = Arrays.asList(pokerName);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
