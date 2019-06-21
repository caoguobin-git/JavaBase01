/***********************************************
 * File Name: SubtractionQuizLoop
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 10:25
 ***********************************************/

package com.programming.chapter5.program;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                for (int k = 0; k < 10000; k++){
                    System.out.printf("%6d   %6d  %6d", i,j,k);
                    System.out.println();
                }
            }
        }
    }
}
