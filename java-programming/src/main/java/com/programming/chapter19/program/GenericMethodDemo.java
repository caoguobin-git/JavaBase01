/***********************************************
 * File Name: GenericMethodDemo
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 27 06 2019 10:52
 ***********************************************/

package com.programming.chapter19.program;

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5};
        String[] strings={"London","Paris","New York","Austin"};

        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
    }

    private static <E> void print(E[] list) {
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"  ");
        }
        System.out.println();
    }
}
