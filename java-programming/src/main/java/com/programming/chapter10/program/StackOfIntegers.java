/***********************************************
 * File Name: StackOfIntegers
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 10:55
 ***********************************************/

package com.programming.chapter10.program;


public class StackOfIntegers {
    private int[] elements;
    private int size=0;
    private static final int DEFAULT_CAPACITY=16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity){
        elements=new int[capacity];
    }

    public boolean empty(){
        return size==0;
    }

    public int peek(){
        return elements[size-1];
    }

    public void push(int value){
        if (size>=elements.length){
            int[] temp=new int[elements.length*2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements=temp;
        }
        elements[size++]=value;
    }

    public int pop(){
        return elements[--size];
    }

    public int getSize(){
        return size;
    }
}
