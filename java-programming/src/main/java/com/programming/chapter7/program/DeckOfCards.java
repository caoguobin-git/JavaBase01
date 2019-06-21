/***********************************************
 * File Name: DeckOfCards
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 15:07
 ***********************************************/

package com.programming.chapter7.program;

import java.util.Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] cards=new int[52];
        for (int i=0;i<cards.length;i++){
            cards[i]=i;
        }
        for (int i=0;i<cards.length;i++){
            int j= (int) (Math.random()*cards.length);
            swap(cards,i,j);
        }
        System.out.println(Arrays.toString(cards));
    }


    private static void swap(int[] cards, int i, int j) {
        int temp=cards[i];
        cards[i]=cards[j];
        cards[j]=temp;
    }
}
