/***********************************************
 * File Name: JsoupTest
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 12:13
 ***********************************************/

package com.duochuang.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

public class JsoupTest {
    @Test
    public void all() throws IOException {
        String url="https://item.jd.com/7348367.html";
        Document document = Jsoup.connect(url).get();
        System.out.println(document);
        System.out.println(document.html());
    }

    @Test
    public void title() throws IOException{
        String url="https://item.jd.com/7348367.html";
        Document document = Jsoup.connect(url).get();
        Elements select = document.select(".sku-name");
        System.out.println(select.html());


    }
}
