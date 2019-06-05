/***********************************************
 * File Name: HelloTest
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 13:54
 ***********************************************/

package com.duochuang;

import com.duochuang.beans.ObjectFactory;
import com.duochuang.test.HelloService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;

@RunWith(SpringJUnit4ClassRunner.class)
//这里告诉Spring，启动Spring上下文的时候扫描相应的配置，并把相应的bean放入容器
@ContextConfiguration(classes = CDConfig.class)
public class HelloTest {

    @Autowired
    private HelloService helloService;

    @Autowired
    private Calendar calendar;

//    ClassPathXmlApplicationContext context;
//
//    @Before
//    public void before() {
//        context = new ClassPathXmlApplicationContext("applicationContext.xml");
//    }

    @Test
    public void helloTest() {
        helloService.hello("hahah");
    }

    @Test
    public void calender() {
        System.out.println(calendar.get(Calendar.YEAR));
    }

    @Test
    public void objectBeanFactoryTest() {

    }


}
