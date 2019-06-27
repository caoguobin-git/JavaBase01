
package com.programming.chapter3.exercise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class exercise3_8 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedList linkedList=new LinkedList();
        for (int i=0;i<3;i++){
            linkedList.add(scanner.nextInt());
        }
        Collections.sort(linkedList);
        System.out.println(linkedList);
    }
}
