package com.ramostear.autowired.annotation.beans;

import org.springframework.stereotype.Component;

/**
 * @ClassName Keyboard
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:39
 **/
@Component
public class Keyboard {

    public void working(){
        System.out.println("keyboard is working...");
    }
}
