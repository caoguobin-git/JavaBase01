/***********************************************
 * File Name: AnyWildCardDemo
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 27 06 2019 11:41
 ***********************************************/

package com.programming.chapter19.program;

public class AnyWildCardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack=new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        print(intStack);
    }

    private static void print(GenericStack<?> stack) {
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+"  ");
        }
    }
}
