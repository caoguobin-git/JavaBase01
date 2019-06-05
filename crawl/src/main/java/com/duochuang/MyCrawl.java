package com.duochuang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyCrawl {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, ParseException {
        Map<String, String> mapResult = new HashMap<>();
        String url = "https://www.jin10.com/";
        URL url1 = new URL(url);
        //打开url链接
        HttpURLConnection urlConnection = (HttpURLConnection) url1.openConnection();
        //利用urlConnection获取输入流
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                urlConnection.getInputStream(), "UTF-8"));// 得到输入流，即获得了网页的内容
        String line;
        String timePrefix = "<div class=\"jin-flash_time\">";
        String contentPrefix = "<div class=\"jin-flash_b\">";
        String sufix = "</div>";
        String time = null;
        String content = null;
        line = reader.readLine();
        while (line.length() > 0) {

            if (line.indexOf(timePrefix) == -1) {
                break;
            }
            line = line.substring(line.indexOf(timePrefix) + timePrefix.length());
            time = line.substring(0, line.indexOf(sufix));
            System.out.println(time);
            line = line.substring(line.indexOf(sufix) + sufix.length());
            line = line.substring(line.indexOf(contentPrefix) + contentPrefix.length());
            content = line.substring(0, line.indexOf(sufix));
            mapResult.put(time, content);
        }

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://39.106.33.181:3306/crawl?characterEncoding=utf-8", "root", "root");
        String sql = "insert ignore into crawlresult values(null,?,?)";
        PreparedStatement preparedStatement = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-M-d HH:mm:ss");
        preparedStatement = connection.prepareStatement(sql);
        for (Map.Entry<String, String> entry : mapResult.entrySet()) {
            Date date = new Date();
            String date1 = ""+(date.getYear()+1900)+"-"+(date.getMonth()+1)+"-"+date.getDate()+" ";
            String dateTime=date1+entry.getKey();
            Date parse = simpleDateFormat.parse(dateTime);
            preparedStatement.setTimestamp(1, new Timestamp(parse.getTime()));
            preparedStatement.setString(2, entry.getValue());
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        preparedStatement.close();
        connection.close();
    }
}
