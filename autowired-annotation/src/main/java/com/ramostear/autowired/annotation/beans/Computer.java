package com.ramostear.autowired.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName Computer
 * @Description @Autowired注解作用在属性上
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:36
 **/
@Component
public class Computer {

    @Autowired
    private Keyboard keyboard;

    @Autowired
    private Mouse mouse;

    @Autowired
    private Screen screen;

    public void working(){
        screen.working();
        keyboard.working();
        mouse.working();
        System.out.println("computer is working...");
    }
}
