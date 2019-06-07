
package com.programming.chapter3.exercise;

import java.io.*;

public class exercise3_27 {

    public static void main(String[] args) throws IOException {
        int a=0;
        int x=0;
        String ab ="adfasdf";
        ab.toUpperCase();
        File file=new File("e:/unicode.txt");
        file.createNewFile();
        OutputStream outputStream=new FileOutputStream(file,true);
        PrintWriter printWriter=new PrintWriter(outputStream);
        for (int i=0;i<65536;i++,x++){
            if (x%30==0){
                printWriter.println();
            }
            printWriter.print((char)(a+i));
        }
        printWriter.flush();
        printWriter.close();
        outputStream.close();
    }
}
