package com.ramostear.configuration.annotation.task;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DemoTask
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/27 0027 6:06
 * @Version since UnaBoot-1.0
 **/
public class DemoTask {

    private int num = 0;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void task(){

        System.out.println(sdf.format(new Date())+": number = "+(++num));
    }
}
