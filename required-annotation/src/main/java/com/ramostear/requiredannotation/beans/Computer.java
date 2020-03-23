package com.ramostear.requiredannotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:01
 **/
@Component
public class Computer {

    private Screen screen;

    @Required
    //@Autowired
    public void setScreen(Screen screen){
        this.screen = screen;
    }
    public void work(){
        screen.on();
        System.out.println("Computer is already working...");
    }
}
