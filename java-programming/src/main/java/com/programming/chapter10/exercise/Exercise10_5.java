/***********************************************
 * File Name: Exercise10_5
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 13:59
 ***********************************************/

package com.programming.chapter10.exercise;

import com.programming.chapter10.program.StackOfIntegers;

public class Exercise10_5 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        int a = 10000;
        for (int i = 2; i < 120;) {
            if (a % i == 0) {
                stack.push(i);
                a = a / i;
                i = 2;
                continue;
            }
            i++;
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
