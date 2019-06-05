package com.duochuang;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

public class CrawlWebMagic implements PageProcessor{

    private Site site = Site.me().setDomain("my.oschina.net");


    @Override
    public void process(Page page) {
        page.addTargetRequest("https://www.jin10.com/");
        page.putField("content", page.getHtml().$("div.content").toString());
    }

    @Override
    public Site getSite() {
        return null;
    }

    public static void main(String[] args) {

    }

}

