/***********************************************
 * File Name: Test01
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 11:20
 ***********************************************/

package com.javabase.day13.day1302;

import java.io.File;

/*文件夹总大小*/
public class Test01 {
    public static void main(String[] args) {
        File file=new File("E:\\javaDoc");
      long result=  jisuan(file);
        System.out.println(result);
    }

    private static long jisuan(File file) {
        File[] files = file.listFiles();
        if (files==null){
            return 0;
        }
        long result =0;
        for (File file1 : files) {
            if (file1.isFile()){
                result+=file1.length();
            }else if (file1.isDirectory()){
                result+=jisuan(file1);
            }
        }
        return result;
    }
}
