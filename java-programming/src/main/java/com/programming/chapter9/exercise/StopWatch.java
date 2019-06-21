/***********************************************
 * File Name: StopWatch
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 9:43
 ***********************************************/

package com.programming.chapter9.exercise;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        this.startTime=new Date().getTime();
    }

    public void start(){
        this.startTime=new Date().getTime();
    }

    public void stop(){
        this.endTime=new Date().getTime();
    }

    public long getElapsedTime(){
        return endTime-startTime;
    }
}
