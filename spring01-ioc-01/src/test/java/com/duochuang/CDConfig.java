/***********************************************
 * File Name: CDConfig
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 14:37
 ***********************************************/

package com.duochuang;

import com.duochuang.test.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@ComponentScan
@Configuration
public class CDConfig {

    @Bean
    public HelloService getHelloService(){
        return new HelloService();
    }

    @Bean
    public Calendar getCalendar(){
        return Calendar.getInstance();
    }
}
