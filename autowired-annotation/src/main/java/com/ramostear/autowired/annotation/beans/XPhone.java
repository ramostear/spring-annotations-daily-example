package com.ramostear.autowired.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName XPhone
 * @Description @Autowired注解作用在构造方法上
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:52
 **/
@Component
public class XPhone {
    private final Keyboard keyboard;
    private final Mouse mouse;
    private final Screen screen;

    @Autowired
    public XPhone(Keyboard keyboard,Mouse mouse,Screen screen){
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.screen = screen;
    }

    public void working(){
        keyboard.working();
        mouse.working();
        screen.working();
        System.out.println("XPhone is working...");
    }
}
