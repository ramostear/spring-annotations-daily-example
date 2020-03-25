package com.ramostear.qualifier.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @ClassName CowZoo
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 1:19
 * @Version since UnaBoot-1.0
 **/
@Component
public class CowZoo {
    @Autowired
    @Qualifier(value = "cow")
    private Animal animal;

    public void animalSpeaking(){
        animal.speak();
    }
}
