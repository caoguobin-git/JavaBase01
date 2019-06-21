/***********************************************
 * File Name: Exercise10_5
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 13:59
 ***********************************************/

package com.programming.chapter10.exercise;

import com.programming.chapter10.program.StackOfIntegers;

public class Exercise10_6 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        int n=120;
        for (int i=2;i<=120;i++){
            if (isPrimeNumber(i)){
                stack.push(i);
            }
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    private static boolean isPrimeNumber(int n) {
        boolean result =true;
        for (int i=2;i<(int)Math.sqrt(n)+1;i++){
            if (n%i==0){
                result=false;
            }
        }
        return result;
    }
}
