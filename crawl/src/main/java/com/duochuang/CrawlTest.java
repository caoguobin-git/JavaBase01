package com.duochuang;

import com.sun.media.sound.SoftTuning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class CrawlTest {
    private String url;
    private String encoding;
    private Map<String,String> mapResult;

    public Map<String, String> getMapResult() {
        return mapResult;
    }

    public void setMapResult(Map<String, String> mapResult) {
        this.mapResult = mapResult;
    }

    public static void main(String[] args) throws IOException {
        CrawlTest crawlTest = new CrawlTest("https://www.jin10.com/", "UTF-8");
        crawlTest.runTest();
    }

    public CrawlTest(String url, String encoding) {
        this.url = url;
        this.encoding = encoding;
    }



    public void runTest() throws IOException {
//        URL url1 = new URL(url);// 根据链接（字符串格式），生成一个URL对象
//
//        HttpURLConnection urlConnection = (HttpURLConnection) url1
//                .openConnection();// 打开URL
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(
//                urlConnection.getInputStream(), encoding));// 得到输入流，即获得了网页的内容
//        String line; // 读取输入流的数据，并显示
//        String timePrefix = "<div class=\"jin-flash_time\">";
//        String contentPrefix = "<div class=\"jin-flash_b\">";
//        String sufix = "</div>";
//        String time = null;
//        String content = null;
//        line = reader.readLine();
//        while (line.length()>50) {
//
//            //System.out.println(line);
//            if (line.indexOf(timePrefix)==-1){
//                break;
//            }
//            line = line.substring(line.indexOf(timePrefix)+timePrefix.length());
//            //System.out.println(line);
//            time = line.substring(0,line.indexOf(sufix));
//            System.out.println(time);
//
//            line=line.substring(line.indexOf(sufix)+sufix.length());
//            //System.out.println(line);
//            line = line.substring(line.indexOf(contentPrefix)+contentPrefix.length());
//            content=line.substring(0,line.indexOf(sufix));
//            System.out.println(content);
//            mapResult.put(time, content);
//        }
    }
}
