/***********************************************
 * File Name: HelloTest
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 13:54
 ***********************************************/

package com.duochuang.test;

import com.duochuang.controller.HelloService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class HelloTest {
    ClassPathXmlApplicationContext context;

    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void helloTest(){
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.hello("hahah");
        context.close();
    }

    @Test
    public void calender(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bead对象
        Calendar calendar= (Calendar) context.getBean("calendar");
        assert calendar.get(Calendar.YEAR)==2019:"failed";
        context.close();
    }

}
