/***********************************************
 * File Name: TestStack
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 27 06 2019 9:19
 ***********************************************/

package com.programming.chapter19.program;

import org.springframework.beans.factory.annotation.Autowired;

public class TestStack {
    public static void main(String[] args) {
        GenericStack<String> stack=new GenericStack<>();
        stack.push("London");
        stack.push("Paris");
        stack.push("Berlin");
        GenericStack<Integer> stack1=new GenericStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack);
        System.out.println(stack1);
    }
}
