/***********************************************
 * File Name: Test01
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 11:29
 ***********************************************/

package com.javabase.day13.day1303;

import java.io.*;

/*写文件*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        File file=new File("e:/hello.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file,true);

        PrintWriter printWriter=new PrintWriter(fileOutputStream);
        for (int i=0;i<10000;i++){
            printWriter.println(i);
        }
        printWriter.close();
        fileOutputStream.close();


    }
}
