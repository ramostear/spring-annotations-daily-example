package com.ramostear.autowired.annotation.beans;

import org.springframework.stereotype.Component;

/**
 * @ClassName Mouse
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:40
 **/
@Component
public class Mouse {

    public void working(){
        System.out.println("mouse is working...");
    }
}
