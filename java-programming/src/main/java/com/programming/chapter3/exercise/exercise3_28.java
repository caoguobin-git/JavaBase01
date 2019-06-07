
package com.programming.chapter3.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercise3_28 {

    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("e:/hello.txt");
        Scanner scanner=new Scanner(file);
        String a =null;
        while ((a=scanner.nextLine())!=null){
            System.out.println(a);
        }
    }
}
