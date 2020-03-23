package com.ramostear.autowired.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName MagicBook
 * @Description @Autowired 注解作用在setter方法上
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:47
 **/
@Component
public class MagicBook {

    private Keyboard keyboard;
    private Mouse mouse;
    private Screen screen;

    @Autowired
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    @Autowired
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    @Autowired
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void working(){
        screen.working();
        keyboard.working();
        mouse.working();
        System.out.println("MagicBook is working...");
    }
}
