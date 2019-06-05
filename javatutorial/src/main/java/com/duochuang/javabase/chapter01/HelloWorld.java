/***********************************************
 * File Name: HelloWorld
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 19 04 2019 14:47
 ***********************************************/

package com.duochuang.javabase.chapter01;

import java.util.regex.Pattern;

public class HelloWorld {
    public static void main(String[] args){
        String param ="111.";
        Pattern pattern=Pattern.compile("^\\d+(\\.)?(\\d+)?");
        boolean hello = pattern.matcher(param).matches();
        System.out.println(hello);
        System.out.println(Double.parseDouble(param));
    }
}
