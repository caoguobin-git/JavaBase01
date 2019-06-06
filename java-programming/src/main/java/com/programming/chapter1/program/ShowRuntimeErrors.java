/***********************************************
 * File Name: ShowRuntimeErrors
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 10:26
 ***********************************************/

package com.programming.chapter1.program;

public class ShowRuntimeErrors {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("出现错误");
        }
    }
}
