/***********************************************
 * File Name: Test001
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 16:42
 ***********************************************/

package com.duochuang.beans;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.util.Strings;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;



public class Test001 {
    public static void main(String[] args) throws IOException {
        Connection connect = Jsoup.connect("https://cdn-rili.jin10.com/data/2019/0605/economics.json");
        connect.ignoreContentType(true);
        Document document = connect.get();
        String text = document.body().text();
        System.out.println(text);
        text="{\"data\":"+text+"}";
        ObjectMapper objectMapper=new ObjectMapper();
        EconimicList econimicList = objectMapper.readValue(text, EconimicList.class);
        for (Object o : econimicList.getData()) {
            EconomicsEntity economicsEntity= (EconomicsEntity) o;
            System.out.println(economicsEntity.getName());
        }
    }
}
