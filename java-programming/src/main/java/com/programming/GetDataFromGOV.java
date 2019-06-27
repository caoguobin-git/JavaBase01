/***********************************************
 * File Name: GetDataFromGOV
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 27 06 2019 12:37
 ***********************************************/

package com.programming;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Calendar;

public class GetDataFromGOV {
    public static void main(String[] args) throws IOException {
//        Jsoup.connect("http://39.106.33.181:8558/car/getData/201802");
        for (int i=2014;i<=2017;i++){
            int j=1;
            for (int x=j;x<=12;x++){
                String param=getDouble(x);
                param=i+param;
                System.out.println(param);
                Connection connect = Jsoup.connect("http://localhost:8558/car/getData/" + param);
                connect.ignoreContentType(true);
                connect.timeout(10000000);
                Document document = connect.get();
                System.out.println(document.text());

            }
        }

    }

    private static String getDouble(int x) {
        if (x<10){
            return "0"+x;
        }
        return String.valueOf(x);
    }
}
