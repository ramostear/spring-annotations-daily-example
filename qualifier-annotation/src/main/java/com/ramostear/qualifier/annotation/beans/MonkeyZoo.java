package com.ramostear.qualifier.annotation.beans;

import com.ramostear.qualifier.annotation.custom.AnimalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName MonkeyZoo
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 1:49
 * @Version since UnaBoot-1.0
 **/
@Component
public class MonkeyZoo {

    @Autowired
    @AnimalType(value = "monkey")
    private Animal animal;

    public void monkeyShowTime(){
        animal.speak();
    }

}
