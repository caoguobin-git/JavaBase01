/***********************************************
 * File Name: CreatFiles
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 17:26
 ***********************************************/

package com.programming;

import java.io.*;

public class CreatFiles {
    public static void main(String[] args) throws IOException {
        for (int i=2;i<=34;i++) {
            String fileName = "E:\\workspace\\idea\\JavaBase\\java-programming\\src\\main\\java\\com\\programming\\chapter3\\exercise\\exercise3_" + i + ".java";
            File file=new File(fileName);
            file.createNewFile();
            OutputStream outputStream=new FileOutputStream(file,true);
            PrintWriter printWriter=new PrintWriter(outputStream);
            printWriter.println();
            printWriter.println("package com.programming.chapter3.exercise;");
            printWriter.println();
            printWriter.println("public class exercise3_"+i+" {");
            printWriter.println();
            printWriter.println("public static void main(String[] args){");
            printWriter.println();
            printWriter.println("    }");
            printWriter.println("}");
            printWriter.flush();
            printWriter.close();
            outputStream.close();
        }
    }
}
