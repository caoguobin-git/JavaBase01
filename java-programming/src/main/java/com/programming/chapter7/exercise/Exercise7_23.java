/***********************************************
 * File Name: Exercise7_23
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 16:38
 ***********************************************/

package com.programming.chapter7.exercise;

import java.util.Arrays;

public class Exercise7_23 {
    public static void main(String[] args) {
        boolean[] store = new boolean[100];
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 100; j += (i + 1)) {
                store[j] = store[j] ? false : true;
            }
        }

        System.out.println(Arrays.toString(store));
    }
}
