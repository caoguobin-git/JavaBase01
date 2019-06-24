/***********************************************
 * File Name: Exercise11_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 17:23
 ***********************************************/

package com.programming.chapter11.exercise;


import java.io.*;

public class Exercise11_000 {
    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file,false);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        for (int i=0;i<100;i++){
            printWriter.println(i);
        }
        printWriter.flush();
        printWriter.close();
    }
}
