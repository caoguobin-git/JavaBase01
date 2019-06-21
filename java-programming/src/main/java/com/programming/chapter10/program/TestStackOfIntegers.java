/***********************************************
 * File Name: TestStackOfIntegers
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 10:58
 ***********************************************/

package com.programming.chapter10.program;

import java.util.Stack;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack=new StackOfIntegers();
        for (int i=0;i<10;i++){
            stack.push(i);
        }

        while (!stack.empty()){
            System.out.print(stack.pop()+"  ");
        }
    }
}
