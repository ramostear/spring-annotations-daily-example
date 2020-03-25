package com.ramostear.qualifier.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName OtherZoo
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 2:04
 * @Version since UnaBoot-1.0
 **/
@Component
public class OtherZoo {

    @Autowired
    private Animal monkey;

    public void showTime(){
        monkey.speak();
    }

}
