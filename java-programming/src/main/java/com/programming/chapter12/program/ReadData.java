/***********************************************
 * File Name: ReadData
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 06 2019 10:00
 ***********************************************/

package com.programming.chapter12.program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("hello.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
