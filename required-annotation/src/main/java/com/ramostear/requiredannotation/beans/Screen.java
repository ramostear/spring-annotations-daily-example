package com.ramostear.requiredannotation.beans;

import org.springframework.stereotype.Component;

/**
 * @ClassName Screen
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:03
 **/
@Component
public class Screen {

    public void on(){
        System.out.println("The screen has started.");
    }
}
