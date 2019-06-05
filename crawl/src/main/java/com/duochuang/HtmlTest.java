package com.duochuang;

import java.util.Date;

public class HtmlTest {
    public static void main(String[] args) {
        GetHtml html = new GetHtml("https://www.jin10.com");
        html.setUrlLink("http://www.baidu.com");
        String htmlContent = html.getHtml();
        System.out.println(htmlContent);
    }

}
