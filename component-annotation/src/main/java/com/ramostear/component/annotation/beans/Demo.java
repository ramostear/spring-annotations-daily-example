package com.ramostear.component.annotation.beans;

import org.springframework.stereotype.Component;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/28 0028 21:05
 * @Version since UnaBoot-1.0
 **/
@Component(value = "demoBean")
public class Demo {
    private String text;

    public Demo() {
        this.text = "hello world.";
        System.out.println("--- Initializing Demo component and text="+this.text+" ---");
    }

    public String getText() {
        return text;
    }
}
