
package com.programming.chapter3.exercise;

import java.util.HashSet;
import java.util.Set;

public class exercise3_24 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 52) + 1;
        String color = null;
        String name;
        switch (a % 4) {
            case 1:
                color = "Clubs";
                break;
            case 2:
                color = "Diamonds";
                break;
            case 3:
                color = "Hearts";
                break;
            case 0:
                color = "Spades";
        }
        switch (a % 13) {
            case 1:
                name = "Ace";
                break;
            case 11:
                name = "Jack";
                break;
            case 12:
                name = "Queen";
                break;
            case 0:
                name = "King";
                break;
            default:
                name = String.valueOf(a % 13);
        }

        System.out.println(color+" "+name);

    }
}
