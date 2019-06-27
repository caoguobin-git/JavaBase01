/***********************************************
 * File Name: GenericStack
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 27 06 2019 9:13
 ***********************************************/

package com.programming.chapter19.program;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list=new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize()-1);
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: "+list.toString();
    }
}
