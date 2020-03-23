package com.ramostear.autowired.annotation.beans;

import org.springframework.stereotype.Component;

/**
 * @ClassName XWatch
 * @Description 不使用@Annotation
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:56
 **/
@Component
public class XWatch {
    private final Keyboard keyboard;
    private final Mouse mouse;
    private final Screen screen;

    public XWatch(Keyboard keyboard,Mouse mouse,Screen screen){
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.screen = screen;
    }

    public void working(){
        keyboard.working();
        mouse.working();
        screen.working();
        System.out.println("XWatch is working...");
    }
}
